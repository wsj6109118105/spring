package beanlifecircle.TestBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * user:lufei
 * DATE:2021/9/30
 **/
public class Dog {
    public Dog() {
        System.out.println("狗无参构造");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog born");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Dog die");
    }
}
