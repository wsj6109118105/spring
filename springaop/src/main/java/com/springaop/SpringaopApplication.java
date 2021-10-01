package com.springaop;

import com.springaop.targat.TargetClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringaopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringaopApplication.class, args);
        TargetClass targetClass = run.getBean(TargetClass.class);
        targetClass.test("test");
    }

}
