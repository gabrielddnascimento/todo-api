package com.api.todolist.entities.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class TaskRepository {
	
	@Autowired
	EntityManager manager;

	@Query
	public Object loadTasks(Long userId) {
		return userId;
	}
}
