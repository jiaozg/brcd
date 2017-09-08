package com.brcd.common.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.Map.Entry;

/**
 * 转换工具类
 */
public class ConvertUtil {

    /**
     * 字符串拼接转换成Map
     *
     * @param str
     * @return
     */
    public static Map<String, String> strCover2StringMap(String str) {
        Map<String, String> mapRequest = new HashMap<String, String>();

        String[] arrSplit = null;
        if (str == null) {
            return mapRequest;
        }
        // 每个键值为一组
        arrSplit = str.split("[&]");
        for (String strSplit : arrSplit) {
            String[] arrSplitEqual = null;
            arrSplitEqual = strSplit.split("[=]", 2);

            // 解析出键值
            if (arrSplitEqual.length > 1) {
                // 正确解析
                mapRequest.put(arrSplitEqual[0], arrSplitEqual[1]);

            } else {
                if (arrSplitEqual[0] != "") {
                    // 只有参数没有值，不加入
                    mapRequest.put(arrSplitEqual[0], "");
                }
            }
        }
        return mapRequest;
    }

    /**
     * 字符串拼接转换成Map
     *
     * @param str
     * @return
     */
    public static Map<String, Object> strCover2ObjectMap(String str) {
        Map<String, Object> mapRequest = new HashMap<String, Object>();

        String[] arrSplit = null;
        if (str == null) {
            return mapRequest;
        }
        // 每个键值为一组
        arrSplit = str.split("[&]");
        for (String strSplit : arrSplit) {
            String[] arrSplitEqual = null;
            arrSplitEqual = strSplit.split("[=]", 2);

            // 解析出键值
            if (arrSplitEqual.length > 1) {
                // 正确解析
                mapRequest.put(arrSplitEqual[0], arrSplitEqual[1]);

            } else {
                if (arrSplitEqual[0] != "") {
                    // 只有参数没有值，不加入
                    mapRequest.put(arrSplitEqual[0], "");
                }
            }
        }
        return mapRequest;
    }

    /**
     * 将一个 Map 对象转化为一个 JavaBean
     *
     * @param clazz 要转化的类型
     * @param map   包含属性值的 map
     * @return 转化出来的 JavaBean 对象
     * @throws IntrospectionException    如果分析类属性失败
     * @throws IllegalAccessException    如果实例化 JavaBean 失败
     * @throws InstantiationException    如果实例化 JavaBean 失败
     * @throws InvocationTargetException 如果调用属性的 setter 方法失败
     */
    @SuppressWarnings("unchecked")
    public static <T> T convertMap(Class<T> clazz, Map<String, String> map) {
        T rep = null;
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(clazz); // 获取类属性
            Object obj = clazz.newInstance(); // 创建 JavaBean 对象
            rep = (T) obj;
            // 给 JavaBean 对象的属性赋值
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptors.length; i++) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();

                if (map.containsKey(propertyName)) {
                    // 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
                    Object value = map.get(propertyName);

                    Object[] args = new Object[1];
                    args[0] = value;

                    descriptor.getWriteMethod().invoke(obj, args);
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return rep;
    }

    /**
     * 把一个Bean对象转换成Map对象
     *
     * @param obj
     * @return
     * @author zhang.hui@pufubao.net
     * @date 2016年10月17日 下午8:40:43
     */
    public static Map<String, Object> convertBean2Map(Object obj) {
        return convertBean2Map(obj, null);
    }

    /**
     * 把一个Bean对象转换成Map对象(忽略serialVersionUID)
     *
     * @param obj
     * @return
     * @author zhang.hui@pufubao.net
     * @date 2016年10月17日 下午8:41:27
     */
    public static Map<String, Object> convertBean2MapForIngoreserialVersionUID(Object obj) {
        return convertBean2Map(obj, new String[]{"serialVersionUID"});
    }

    /**
     * 把一个Bean对象转换成Map对象
     *
     * @param obj
     * @param ignores 忽略field的String[]
     * @return
     * @author zhang.hui@pufubao.net
     * @date 2016年10月17日 下午8:41:51
     */
    public static Map<String, Object> convertBean2Map(Object obj, String[] ignores) {
        Map<String, Object> map = new HashMap<String, Object>();
        Class<? extends Object> clazz = obj.getClass();
        List<Field> fieldList = findAllFieldsOfSelfAndSuperClass(clazz);
        Field field = null;
        try {
            for (int i = 0; i < fieldList.size(); i++) {
                field = fieldList.get(i);
                // 定义fieldName是否在拷贝忽略的范畴内
                boolean flag = false;
                if (ignores != null && ignores.length != 0) {
                    flag = isExistOfIgnores(field.getName(), ignores);
                }
                if (!flag) {
                    Object value = getProperty(obj, field.getName());
                    if (null != value && !StringUtil.EMPTY.equals(value.toString())) {
                        map.put(field.getName(), getProperty(obj, field.getName()));
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 获取一个类和其父类的所有属性
     *
     * @param clazz
     * @return
     * @author zhang.hui@pufubao.net
     * @date 2016年10月17日 下午8:44:00
     */
    public static List<Field> findAllFieldsOfSelfAndSuperClass(Class<?> clazz) {
        Field[] fields = null;
        List<Field> fieldList = new ArrayList<Field>();
        while (true) {
            if (clazz == null) {
                break;
            } else {
                fields = clazz.getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    fieldList.add(fields[i]);
                }
                clazz = clazz.getSuperclass();
            }
        }
        return fieldList;
    }

    /**
     * 判断fieldName是否是ignores中排除的
     *
     * @param fieldName
     * @param ignores
     * @return
     * @author zhang.hui@pufubao.net
     * @date 2016年10月17日 下午8:44:11
     */
    private static boolean isExistOfIgnores(String fieldName, String[] ignores) {
        boolean flag = false;
        for (String str : ignores) {
            if (str.equals(fieldName)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static Object getProperty(Object obj, String propertyName) {
        Class<? extends Object> clazz = obj.getClass();// 获取对象的类型
        PropertyDescriptor pd = getPropertyDescriptor(clazz, propertyName);// 获取clazz类型中的propertyName的属性描述器
        Method getMethod = pd.getReadMethod();// 从属性描述器中获取 get 方法
        Object value = null;
        try {
            value = getMethod.invoke(obj, new Object[]{});// 调用方法获取方法的返回值
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;// 返回值
    }

    public static PropertyDescriptor getPropertyDescriptor(Class<? extends Object> clazz,
                                                           String propertyName) {
        StringBuffer sb = new StringBuffer();// 构建一个可变字符串用来构建方法名称
        Method setMethod;
        Method getMethod;
        PropertyDescriptor pd = null;
        try {
            Field f = clazz.getDeclaredField(propertyName);// 根据字段名来获取字段
            if (f != null) {
                // 构建方法的后缀
                String methodEnd = propertyName.substring(0, 1).toUpperCase()
                        + propertyName.substring(1);
                sb.append("set" + methodEnd);// 构建set方法
                setMethod = clazz.getDeclaredMethod(sb.toString(), new Class[]{f.getType()});
                sb.delete(0, sb.length());// 清空整个可变字符串
                sb.append("get" + methodEnd);// 构建get方法
                // 构建get 方法
                getMethod = clazz.getDeclaredMethod(sb.toString(), new Class[]{});
                // 构建一个属性描述器 把对应属性 propertyName 的 get 和 set 方法保存到属性描述器中
                pd = new PropertyDescriptor(propertyName, getMethod, setMethod);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return pd;
    }


    /**
     * 将Map<String, String[]>转换成Map<String, String>
     *
     * @param parameterMap
     * @return
     */
    private Map<String, String> convertRequest2StrMap(Map<String, String[]> parameterMap) {
        if (parameterMap != null) {
            Map<String, String> map = new HashMap<>();
            Set<Entry<String, String[]>> ps = parameterMap.entrySet();
            for (Entry<String, String[]> e : ps) {
                map.put(e.getKey(), e.getValue()[0]);
            }
            return map;
        }
        return null;
    }

    /**
     * 将Map<String, String[]>转换成Map<String, Object>
     *
     * @param parameterMap
     * @return
     */
    private Map<String, Object> convertRequest2ObjMap(Map<String, String[]> parameterMap) {
        if (parameterMap != null) {
            Map<String, Object> map = new HashMap<>();
            Set<Entry<String, String[]>> ps = parameterMap.entrySet();
            for (Entry<String, String[]> e : ps) {
                map.put(e.getKey(), e.getValue()[0]);
            }
            return map;
        }
        return null;
    }

}
