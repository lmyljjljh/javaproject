package com.lmy.utils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyTool {
    private static SqlSessionFactory factory;//静态工厂
    static {//创建静态工厂对象
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            factory=new SqlSessionFactoryBuilder().build(in);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //获取回话对象
    public static SqlSession getSqlSession() {
        return factory.openSession(true);
    }
}

