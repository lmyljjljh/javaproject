package com.lmy.dao.Impl;

import com.lmy.dao.StudentDao;
import com.lmy.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> findAllStudent() {
        String sql = "select * from student";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }
}
