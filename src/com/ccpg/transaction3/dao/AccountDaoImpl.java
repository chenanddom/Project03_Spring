package com.ccpg.transaction3.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

/**
 * Created by lenovo on 2017/7/20.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String outer, Integer money) {
//        TransactionProxyFactoryBean
        this.getJdbcTemplate().update("update userAccount set salary = salary - ? where username = ?", money,outer);
    }

    @Override
    public void in(String inner, Integer money) {
        this.getJdbcTemplate().update("update userAccount set salary = salary + ? where username = ?", money,inner);
    }
}
