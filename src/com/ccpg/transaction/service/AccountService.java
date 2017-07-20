package com.ccpg.transaction.service;

/**
 * Created by lenovo on 2017/7/20.
 */
public interface AccountService {
    /**
     * 实现转账的功能
     * @param outer 输出者
     * @param inner 输入者
     * @param money 钱数
     */
    public void transferMoney(String outer,String inner,int money);
}
