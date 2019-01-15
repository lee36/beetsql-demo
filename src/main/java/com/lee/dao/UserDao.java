package com.lee.dao;

import com.lee.model.User;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao extends BaseMapper<User> {
    @SqlStatement(params = "username")
    User select(String username);
}
