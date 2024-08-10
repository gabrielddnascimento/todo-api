package com.api.todolist.controllers.cwsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.todolist.entities.user.UserVO;
import com.api.todolist.services.user.UserService;

@Controller
@RequestMapping("/cws-api/user")
public class UserCWSController {

	@Autowired
	UserService userService;

	@PutMapping
	public ResponseEntity<Boolean> userRegister(@RequestBody UserVO userVO) throws Exception {
		userService.registerUser(userVO);
		return ResponseEntity.ok(Boolean.TRUE);
	}
}
