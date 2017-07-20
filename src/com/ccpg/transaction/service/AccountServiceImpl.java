package com.ccpg.transaction.service;

import com.ccpg.transaction.dao.AccountDao;

/**
 * Created by lenovo on 2017/7/20.
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transferMoney(String outer, String inner, int money) {
        this.accountDao.out(outer,money);
        int i=1/0;
        this.accountDao.in(inner,money);
    }
}
