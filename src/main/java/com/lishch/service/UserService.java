package com.lishch.service;

import com.lishch.model.User;

public interface UserService {
	/**
	 * find user by user_id
	 * @param userId
	 * @return
	 */
	User findUserById(int userId);
}
