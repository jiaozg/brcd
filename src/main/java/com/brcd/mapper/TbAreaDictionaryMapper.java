package com.brcd.mapper;

import com.brcd.bean.TbAreaDictionary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 地址持久层
 * Created by admin on 2017/9/11.
 */
@Mapper
@Repository
public interface TbAreaDictionaryMapper {
    /**
     * 查询所有的省
     * @param upAreaOde
     * @return
     */
    List<TbAreaDictionary> findByareaId(Integer upAreaOde);

    /**
     * 根据省查询市
     * @param areaCode
     * @return
     */
    List<TbAreaDictionary> findByAreaOde(Integer areaCode);

}
