package com.ccpg.transaction2.dao;

/**
 * Created by lenovo on 2017/7/20.
 */
public interface AccountDao {
    /**
     * 汇款
     * @param outer
     * @param money
     */
    public void out(String outer, Integer money);

    /**
     * 收款
     * @param inner
     * @param money
     */
    public void in(String inner, Integer money);
}
