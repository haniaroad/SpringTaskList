package com.TaskList.TaskList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskList.TaskList.entities.Task;

public interface TaskRepository extends JpaRepository <Task, Integer>{

}
