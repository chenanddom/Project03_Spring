package com.ccpg.transaction3.service;

import com.ccpg.transaction3.dao.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by lenovo on 2017/7/20.
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public void transferMoney(final String outer, final String inner, int money) {
              accountDao.out(outer,money);
//                int i=1/0;
                accountDao.in(inner,money);


    }
}
