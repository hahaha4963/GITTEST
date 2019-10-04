package com.zf.dao;

import com.zf.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    @Select("SELECT * from USER")
    List<User> findAll();
}
