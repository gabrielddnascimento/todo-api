package com.api.todolist.controllers.cwsapi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.todolist.entities.user.UserVO;
import com.api.todolist.services.user.UserService;

@Controller
@RequestMapping("/cws-api/user")
public class UserCWSController {

	private static final Logger logger = LogManager.getLogger(UserCWSController.class);

	@Autowired
	private UserService userService;

	@PutMapping
	public ResponseEntity<Boolean> userRegister(@RequestBody UserVO userVO) throws Exception {
		logger.info("Cadastrando usuário com o email: {}", userVO.getUserEmail());
		userService.registerUser(userVO);
		return ResponseEntity.ok(Boolean.TRUE);
	}

	@PostMapping
	public ResponseEntity<UserVO> userLogin(@RequestBody UserVO userVO) throws Exception {
		logger.info("Realizando tentativa de login com o email: {}" + userVO.getUserEmail());
		userVO = userService.loginUser(userVO);
		return ResponseEntity.ok(userVO);
	}
}
