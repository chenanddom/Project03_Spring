package com.ccpg.transaction5.service;

import com.ccpg.transaction5.dao.AccountDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lenovo on 2017/7/20.
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public void transferMoney(final String outer, final String inner, int money) {
              accountDao.out(outer,money);
                int i=1/0;
                accountDao.in(inner,money);


    }
}
