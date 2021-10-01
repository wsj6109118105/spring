package com.proxytest.proxyClass;

import com.proxytest.Service.dynamicCakeService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * user:lufei
 * DATE:2021/10/1
 **/
public class dynamicProxy implements InvocationHandler {

    //代理目标对象
    private Object target;

    public dynamicProxy(Object target) {
        this.target = target;
    }

    //生成代理对象
    public Object proxy(){
        Class<?> cla = target.getClass();
        return Proxy.newProxyInstance(cla.getClassLoader(),cla.getInterfaces(),this);
    }

    /*
    * @param: o 动态生成的代理对象
    * @param: method 代理方法
    * @param: objects 方法参数
     */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        before(target);
        Object invoke = method.invoke(target, objects);
        after(target);
        return invoke;
    }

    public void before(Object o){
        if(o instanceof dynamicCakeService){
            System.out.println("prepare dynamic");
        }else {
            System.out.println("不支持的代理类型"+o.getClass());
        }
    }

    public void after(Object o){
        if(o instanceof dynamicCakeService){
            System.out.println("sell dynamic");
        }else {
            System.out.println("不支持的代理类型"+o.getClass());
        }
    }
}
