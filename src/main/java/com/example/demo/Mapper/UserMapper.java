package com.example.demo.Mapper;

import com.example.demo.Model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    @Insert("INSERT INTO users(user_id, password) VALUES(#{user_id}, #{password})")
    Boolean insert(User model);

    // select by ID
    @Select("SELECT * FROM users WHERE user_id=#{user_id}")
    User select(String user_id);

    // select all
    @Select("SELECT * FROM users")
    List<User> selectAll();

    // update value
    @Update("UPDATE users SET value=#{value} WHERE user_id=#{user_id}")
    int updateValue(User model);

    // delete by id
    @Delete("DELETE FROM users WHERE user_id=#{user_id}")
    int delete(String user_id);



}
