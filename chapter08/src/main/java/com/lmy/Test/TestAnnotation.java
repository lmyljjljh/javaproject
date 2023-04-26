package com.lmy.Test;
import com.lmy.User.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAnnotation {
    public static void main(String[] args){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        UserDao userDao = context.getBean("userDao",UserDao.class);
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
    }
}