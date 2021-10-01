package beanlifecircle.config;

import beanlifecircle.TestBean.Cat;
import beanlifecircle.TestBean.Dog;
import beanlifecircle.TestBean.MyBeanProcessor;
import beanlifecircle.TestBean.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * user:lufei
 * DATE:2021/9/30
 **/
@Configuration
@ComponentScan(basePackages = {"beanlifecircle.TestBean"})
public class LifeCircleConfig {

    /*@Bean(initMethod = "init",destroyMethod = "destory")
    public People people(){
        return new People();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }*/

    @Bean
    public MyBeanProcessor processor(){
        return new MyBeanProcessor();
    }
}
