package com.TaskList.TaskList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskList.TaskList.entities.Users;

public interface UserRepository extends JpaRepository <Users, Integer>{

}
