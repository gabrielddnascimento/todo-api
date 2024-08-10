package com.api.todolist.services.user;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.todolist.entities.user.User;
import com.api.todolist.entities.user.UserRepository;
import com.api.todolist.entities.user.UserVO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public void registerUser(UserVO userVO) throws Exception {
		if (userVO == null || userVO.getUserEmail() == null || userVO.getUserName() == null || userVO.getUserPassword()== null ) {
			throw new Exception();
		}

		String encodedPassword = DigestUtils.sha256Hex(userVO.getUserPassword());

		User user = new User();
		user.setUserEmail(userVO.getUserPassword());
		user.setUserName(userVO.getUserName());
		user.setUserPassword(encodedPassword);

		userRepository.save(user);
	}

}
