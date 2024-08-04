package com.api.todolist.controllers.cwsapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoCWSController {

	@PostMapping("/todo")
	public ResponseEntity<String> loadTodoListByUserId() {
		return ResponseEntity.ok("OK");
	}

	@PutMapping("/todo/task")
	public ResponseEntity<String> registerTask() {
		return ResponseEntity.ok(null);
	}

	@DeleteMapping("/todo/task")
	public ResponseEntity<String> deleteTaskById(@RequestParam Long taskId) {
		return ResponseEntity.ok(null);
	}
}
