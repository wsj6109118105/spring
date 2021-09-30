package beanlifecircle.TestBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * user:lufei
 * DATE:2021/9/30
 **/
public class People {
    public People() {
        System.out.println("People无参构造");
    }

    public void init() {
        System.out.println("初始化");
    }

    public void destory(){
        System.out.println("销毁");
    }

}
