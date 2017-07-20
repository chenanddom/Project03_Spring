package com.ccpg.transaction4.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

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
