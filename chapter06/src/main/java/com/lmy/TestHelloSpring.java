package com.lmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
    public static void main(String[] args) {
        // 初始化 Spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取 HelloSpring 实例
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        // 调用 show 方法输出信息
        helloSpring.show();
    }
}
