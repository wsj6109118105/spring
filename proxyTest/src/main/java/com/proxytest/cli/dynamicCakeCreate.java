package com.proxytest.cli;

import com.proxytest.Service.Impl.dynamicCakeServiceImpl;
import com.proxytest.Service.dynamicCakeService;
import com.proxytest.proxyClass.dynamicProxy;

/**
 * user:lufei
 * DATE:2021/10/1
 **/
public class dynamicCakeCreate {
    public static void main(String[] args) {
        dynamicCakeService dynamicCakeService = (dynamicCakeService) new dynamicProxy(new dynamicCakeServiceImpl()).proxy();
        dynamicCakeService.makeCake();
    }
}
