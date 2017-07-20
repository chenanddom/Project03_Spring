package com.ccpg.transaction3.test;

import com.ccpg.transaction3.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/20.
 */
public class MyTest {
    @Test
    public void test1(){
        String xmlPath = "com/ccpg/transaction3/bean.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("proxyId");
        accountService.transferMoney("zhangsan" ,"lisi" ,1000);
    }
}
