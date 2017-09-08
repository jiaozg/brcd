package com.brcd.common.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Date工具类
 */
public class DateUtil {

    private static Logger log = LoggerFactory.getLogger(DateUtil.class);

    public static final String DATE_STYLE_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String DATE_STYLE_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_STYLE_YYYYMMDD = "yyyyMMdd";
    public static final String DATE_STYLE_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String DATE_STYLE_YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";

    /**
     * 获取系统当前时间（毫秒）
     *
     * @return int
     */
    public static Long getCurrentSecond() {
        return ((new Date().getTime()));
    }

    /**
     * 当前时间按照格式转换
     *
     * @param format
     * @return
     */
    public static String getFormatTime(String format) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 获取yyyy-MM-dd HH:mm:ss格式的当前时间
     *
     * @return
     */
    public static String getYYYYmmddHHmmss() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 获取当前日期的年月日
     *
     * @return
     */
    public static String getYYYYmmdd() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(date);
    }

    /**
     * 获取当前时间的时分秒
     *
     * @return
     */
    public static String getHHmmss() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf2 = new SimpleDateFormat("HHmmss");
        return sdf2.format(date);
    }

    /**
     * 获取上一天凌晨00：00：00的时间毫秒数
     *
     * @return
     */
    public static Long getLastDayZero() {
        Calendar calendar = GregorianCalendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        Calendar calendar2 = new GregorianCalendar(year, month, date - 1, 0, 0, 0);
        return calendar2.getTime().getTime();
    }

    /**
     * 获取本月第一天凌晨00：00：00的时间
     *
     * @return
     */
    public static Date getLastMontZero() {
        Calendar calendar = GregorianCalendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        calendar.set(year, month, 1, 0, 0, 0);
        return calendar.getTime();
    }

    /**
     * 获取当天凌晨00：00：00的时间毫秒数
     *
     * @return
     */
    public static Long getCurDayZero() {
        Calendar calendar = GregorianCalendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        calendar.set(year, month, date, 0, 0, 0);
        return (calendar.getTime().getTime());
    }

    /**
     * 将yyyy-MM-dd HH:mm:ss格式的字符串转化成时间类型
     *
     * @param dateString
     * @return
     */
    public static Date parseDate(String dateString) {
        return parseDate(dateString, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 按照dateStyle将字符串转化成时间类型
     *
     * @param date
     * @param dateStyle
     * @return Date格式的时间
     */
    public static Date parseDate(String date, String dateStyle) {
        if (StringUtils.isBlank(date)) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(dateStyle);
        try {
            return df.parse(date);
        } catch (ParseException e) {
            log.warn(e.getMessage());
        }
        return null;
    }

    /**
     * 将yyyyMMddHHmmss转化为yyyy-MM-dd HH:mm:ss
     *
     * @param dateString
     * @return String
     * @author wang.shuran@pufubao.net
     * @date 2016年6月28日 下午5:49:07
     */
    public static String parseStrToDate(String dateString) {
        if (StringUtils.isBlank(dateString)) {
            return null;
        }
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date;
        try {
            date = (Date) sdf1.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf2.format(date);
    }

    /**
     * 日期格式化
     *
     * @param date
     * @param format
     * @return Calendar格式的时间
     */
    public static Calendar parseCalendar(String date, String format) {
        if (StringUtils.isBlank(date)) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(format);
        try {
            Date d = df.parse(date);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            return c;
        } catch (ParseException e) {
            log.error(e.getMessage() + " [date={}, format={}]", date, format);
        }
        return null;
    }

    /**
     * 把yyyymmdd转成yyyy-MM-dd格式
     *
     * @param str
     * @return
     * @author wangsr
     * @date 2016年5月29日 下午4:57:28
     */
    public static String formatDate(String str) {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
        String sfstr = "";
        try {
            sfstr = sf2.format(sf1.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sfstr;
    }

    /**
     * 将Date类型转化为字符串类型
     *
     * @param date
     * @param dateStyle
     * @return dateString
     */
    public static String parseDate(Date date, String dateStyle) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(dateStyle);
        return df.format(date);
    }

    /**
     * 增加月数
     *
     * @param startdate
     * @param duration
     * @return dateString
     */
    public static String addMonths(String startdate, int duration) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date parse = null;
        try {
            parse = df.parse(startdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(parse);
        calendar.add(GregorianCalendar.MONTH, duration);
        return df.format(calendar.getTime());
    }

    /**
     * 增加月数
     *
     * @param date
     * @param duration
     * @return Date
     */
    public static Date addMonths(Date date, int duration) {
        if (date == null) {
            return null;
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.MONTH, duration);
        return calendar.getTime();
    }

    /**
     * 增加月数(初始化00:00:00)
     *
     * @param date
     * @param duration
     * @return Date
     */
    public static Date addMonthsZero(Date date, int duration) {
        if (date == null) {
            return null;
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        calendar.set(year, month, day, 0, 0, 0);
        calendar.add(GregorianCalendar.MONTH, duration);
        return calendar.getTime();
    }

    /**
     * 增加天数
     *
     * @param startdate
     * @param duration
     * @return dateString
     */
    public static String addDays(String startdate, int duration) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date parse = null;
        try {
            parse = df.parse(startdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(parse);
        calendar.add(GregorianCalendar.DATE, duration);
        return df.format(calendar.getTime());
    }

    /**
     * 增加天数
     *
     * @param date
     * @param duration
     * @return Date
     */
    public static Date addDays(Date date, int duration) {
        if (date == null) {
            return null;
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.DATE, duration);
        return calendar.getTime();
    }

    /**
     * 增加分钟
     *
     * @param date
     * @param duration
     * @return
     */
    public static Date addMinutes(Date date, int duration) {
        if (date == null) {
            return null;
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.MINUTE, duration);
        return calendar.getTime();
    }

    /**
     * 增加秒数
     *
     * @param date
     * @param duration
     * @return
     */
    public static Date addSeconds(Date date, int duration) {
        if (date == null) {
            return null;
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.SECOND, duration);
        return calendar.getTime();
    }

    /**
     * 获取两个日期相差的天数
     *
     * @param date      日期
     * @param otherDate 另一个日期
     * @return 相差天数
     */
    public static int getIntervalDays(Date date, Date otherDate) {
        long time = Math.abs(date.getTime() - otherDate.getTime());
        return (int) (time / (24 * 60 * 60 * 1000));
    }

    /**
     * 计算某日期是否在指定时间段内
     *
     * @param start 开始
     * @param end   结束
     * @param date  日期
     * @return
     */
    public static boolean getDateBetween(Date start, Date end, Date date) {
        if (start == null || end == null || date == null) {
            log.error("判断有参数为空。[start={},end={},date={}]", start, end, date);
            return false;
        }
        long stal = start.getTime();
        long endl = end.getTime();
        long datel = date.getTime();
        if (stal <= datel && datel <= endl) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获得区间段内的日期列表
     *
     * @param beginDate 开始日期 yyyy-MM-dd
     * @param endDate   结束日期 yyyy-MM-dd
     * @return List yyyy-MM-dd格式
     */
    public static List<String> getDateRange(String beginDate, String endDate) {
        Date begin = parseDate(beginDate, "yyyy-MM-dd");
        Date end = parseDate(endDate, "yyyy-MM-dd");
        if (begin.after(end)) {
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<String>();
        while (begin.compareTo(end) <= 0) {
            list.add(parseDate(begin, "yyyy-MM-dd"));
            begin = addDays(begin, 1);
        }
        return list;
    }

    /**
     * 获得当前日期 yyyy-MM-dd
     *
     * @return String
     */
    public static String getCurrentDate() {
        Date date = new Date();
        return format(date, "yyyy-MM-dd");
    }

    /**
     * 获得当前日期 yyyy-MM-dd HH:mm:ss格式的字符串
     *
     * @return String
     */
    public static String getCurrentDateTime() {
        Date date = new Date();
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 将Date格式转化为String
     *
     * @param date
     * @param format
     * @return String
     */
    public static String format(Date date, String format) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 判断日期格式是否合法
     *
     * @param DateStyle 日期格式 如：yyyy-MM-dd
     * @param str       即将验证的字符串
     * @return boolean
     * @author wangsr
     * @date 20160521
     */
    public static boolean isValidDate(String DateStyle, String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写
        SimpleDateFormat format = new SimpleDateFormat(DateStyle);
        try {
            // 设置lenient为false.
            // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * 毫秒转化为时间字符串
     *
     * @param ms        数据库Date类型转化为字符串
     * @param timeStyle 时间格式 如：yyyy-MM-dd HH:mm:ss
     * @return
     * @author wang.shuran@pufubao.net
     * @date 2016年6月8日 下午3:05:24
     */
    public static String msToTime(Date ms, String timeStyle) {
        if (ms == null || StringUtil.isBlank(timeStyle)) {
            return null;
        }
        long time = ms.getTime();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat(timeStyle);
        return sdf.format(date);
    }

    /**
     * 获取每个月份的天数
     *
     * @param month
     * @return
     */
    public static int getDaysEachMonth(int month) {
        if (month <= 0 || month > 12) {
            return 30;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 31);
        Calendar calendar = GregorianCalendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        if (year % 4 == 0) {
            map.put(2, 29);
        } else {
            map.put(2, 28);
        }
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        return map.get(month);
    }

    /**
     * test
     *
     * @param args
     */
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(parseDate(now, DATE_STYLE_YYYY_MM_DD_HH_MM_SS));
        Date addMonths = addMonths(new Date(), 1);
        System.out.println(parseDate(addMonths, DATE_STYLE_YYYY_MM_DD_HH_MM_SS));
        Date monthsZero = addMonthsZero(new Date(), 1);
        System.out.println(parseDate(monthsZero, DATE_STYLE_YYYY_MM_DD_HH_MM_SS));
    }

}
