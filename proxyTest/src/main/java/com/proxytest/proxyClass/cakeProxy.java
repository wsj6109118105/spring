package com.proxytest.proxyClass;

import com.proxytest.Service.Impl.cakeServiceImpl;
import com.proxytest.Service.cakeService;

/**
 * user:lufei
 * DATE:2021/10/1
 **/
public class cakeProxy {
    private cakeService cakeservice;

    public void makeCake(){
        before();
        cakeservice = new cakeServiceImpl();
        cakeservice.makeCake();
        after();
    }

    public void before(){
        System.out.println("prepare");
    }

    public void after(){
        System.out.println("sell");
    }
}
