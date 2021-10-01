package com.springaop.targat;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class TargetClass {

    public String test(String value) {
        System.out.println("目标方法test被执行");
        if (!StringUtils.hasLength(value)) {
            throw new RuntimeException("value不能为空");
        }
        return value;
    }
}
