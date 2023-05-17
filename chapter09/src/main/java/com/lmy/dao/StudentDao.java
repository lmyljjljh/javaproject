package com.lmy.dao;
import com.lmy.entity.Student;
         import java.util.List;
  public interface StudentDao {
      //查询所有账户
              public List<Student> findAllStudent();
  }