package com.chen.springboot.mapper;

import com.chen.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Select("SELECT * FROM users WHERE id = #{userId}")
    User getUserById(int userId);

    @Insert("INSERT INTO users(username, password, email, phone) VALUES(#{username}, #{password}, #{email}, #{phone})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createUser(User user);

    @Update("UPDATE users SET username = #{username}, password = #{password}, email = #{email}, phone = #{phone} WHERE id = #{id}")
    void updateUser(User user);

    @Delete("DELETE FROM users WHERE id = #{userId}")
    void deleteUser(int userId);
}



