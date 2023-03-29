package com.lmy.mapper;

import com.lmy.pojo.IClass;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
public interface IClassMapper {
    @Select("select * from c_class where id=#{id};")
    @Results({@Result(column = "id", property = "id"),
            @Result(column = "classname", property = "classname"),
            @Result(column = "id", property = "studentList",
                    many = @Many(select =
                            "com.lmy.mapper.IStudentMapper.selectStudent"))})
    IClass selectClassById(int id);
//@Select("select * from c_class where id = #{id}")
//@Results({@Result(id = true,property = "id",column = "id"),
//        @Result(property = "classname",column = "classname"),
//        @Result(column = "id",property = "studentList",
//                many = @Many(select = "com.lmy.mapper.IStudentMapper.selectStudent"))})
//IClass selectClassById(int id);
}




