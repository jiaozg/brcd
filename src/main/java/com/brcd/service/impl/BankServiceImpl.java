package com.brcd.service.impl;

import com.brcd.bean.Bank;
import com.brcd.mapper.BankMapper;
import com.brcd.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/9/8.
 */
@Service
public class BankServiceImpl implements BankService{
    @Autowired
    private BankMapper bankMapper;

    @Override
    public List<String> findBankName() {
        return bankMapper.findBankName();
    }

    @Override
    public List<Bank> findByBankName(Bank bank) {
        return bankMapper.findByBankName(bank);
    }

    @Override
    public String findBankNo(String bankSubName) {
        return bankMapper.findBankNo(bankSubName);
    }
}
