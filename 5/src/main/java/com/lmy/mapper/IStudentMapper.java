package com.lmy.mapper;


import com.lmy.pojo.IStudent;
import org.apache.ibatis.annotations.Select;

public interface IStudentMapper {
    @Select("select * from s_student where id = #{id}")
    IStudent selectStudent(int id);
}

