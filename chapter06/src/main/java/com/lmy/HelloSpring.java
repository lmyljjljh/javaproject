package com.lmy;

public class HelloSpring {
    private String userName; // 定义一个字符串类型的属性

    // setter方法，用于设置属性值
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // 定义一个方法，用于输出欢迎信息
    public void show() {
        System.out.println(userName + ": 欢迎来到 Spring！");
    }
}
