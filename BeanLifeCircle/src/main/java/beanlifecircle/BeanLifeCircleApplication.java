package beanlifecircle;

import beanlifecircle.TestBean.Cat;
import beanlifecircle.TestBean.People;
import beanlifecircle.config.LifeCircleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class BeanLifeCircleApplication {

    public static void main(String[] args) {
        //SpringApplication.run(BeanLifeCircleApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LifeCircleConfig.class);
        //People bean = ctx.getBean(People.class);
        //Cat cat = ctx.getBean(Cat.class);
        ctx.close();
    }

}
