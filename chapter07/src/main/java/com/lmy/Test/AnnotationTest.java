package com.lmy.Test;
import com.lmy.User.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnnotationTest {
    public static void main(String[] args){
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserController usercontroller=(UserController)
                applicationContext.getBean("userController");
        usercontroller.save();
    }
}