package com.lishch.dao;

import org.apache.ibatis.annotations.Param;

import com.lishch.model.User;

public interface UserDao {
    /**
     * find user by user_id
     * @param userId
     * @return
     */
    User findUserById(@Param("userId") int userId);
}
