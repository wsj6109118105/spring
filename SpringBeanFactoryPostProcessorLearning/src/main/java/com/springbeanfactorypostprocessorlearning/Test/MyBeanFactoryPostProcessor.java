package com.springbeanfactorypostprocessorlearning.Test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * user:lufei
 * DATE:2021/10/1
 **/
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        System.out.println("实例化 MyBeanFactoryPostProcessor Bean");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("Bean定义的个数："+beanDefinitionCount);
        beanFactory.initializeBean(Object.class,"Hello");
        System.out.println(beanFactory.getBean("Hello"));
        //System.out.println(beanFactory.getBean("TestBean"));

    }

    @Component
    static class TestBean{
        public TestBean(){
            System.out.println("实例化 TestBean Bean");
        }
    }
}
