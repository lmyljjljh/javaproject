package com.lmy.Test;
import com.lmy.mapper.IClassMapper;
import com.lmy.mapper.IStudentMapper;
import com.lmy.pojo.IClass;
import com.lmy.pojo.IStudent;
import com.lmy.utils.MyTool;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
     @Test
 public void findIStudentByIdTest() {
            // 1.通过工具类获取SqlSession对象
            SqlSession session = MyTool.getSqlSession();
           IStudentMapper mapper = session.getMapper(IStudentMapper.class);
           // 2.使用IStudentMapper对象查询id为1的学生的信息
            IStudent student = mapper.selectStudent(2);
            System.out.println(student.toString());
            // 3.关闭SqlSession
            session.close();
        }
    @Test
    public void selectClassByIdTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyTool.getSqlSession();
        IClassMapper mapper = session.getMapper(IClassMapper.class);
        // 2.查询id为2的班级中学生的信息
        IClass icalss = mapper.selectClassById(2);
        System.out.println(icalss.toString());
        session.close();
    }


}