package beanlifecircle.TestBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * user:lufei
 * DATE:2021/9/30
 **/
public class Cat  {
    public Cat() {
        System.out.println("无参构造猫");
    }

    @PostConstruct
    public void init(){
        System.out.println("猫出生");
    }

    @PreDestroy
    public void destory(){
        System.out.println("猫老去");
    }


}
