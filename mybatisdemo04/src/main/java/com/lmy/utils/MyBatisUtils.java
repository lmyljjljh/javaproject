package com.lmy.utils;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    //初始化SQLSessionFactory类加载MyBatis的配置文件
    static {
        try {
            //使用MyBatis提供的Resources类加载MyBatis的配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //构建SqlSessionFactory工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        //获取SqlSession对象的静态方法
        return sqlSessionFactory.openSession(true);
        //若传入true表示关闭事务控制，自动提交;false表示开启事务控制
    }
}