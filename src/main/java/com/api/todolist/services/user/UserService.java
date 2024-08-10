package com.api.todolist.services.user;

import com.api.todolist.entities.user.UserVO;

public interface UserService {
	public void registerUser(UserVO userVO) throws Exception;
}
