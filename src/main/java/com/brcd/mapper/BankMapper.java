package com.brcd.mapper;

import com.brcd.bean.Bank;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admin on 2017/9/8.
 */
@Mapper
@Repository
public interface BankMapper {
    /**
     * 分组查询所有大行
     * @return
     */
    List<String> findBankName();

    /**
     * 根据大行名、省、市查询该条件下的所有支行
     * @param bank
     * @return
     */
    List<Bank> findByBankName(Bank bank);

    /**
     * 根据主键查询支行号
     * @param bankSubName
     * @return
     */
    String findBankNo(String bankSubName);
}
