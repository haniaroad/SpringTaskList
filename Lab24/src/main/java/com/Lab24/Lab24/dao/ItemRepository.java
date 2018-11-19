package com.Lab24.Lab24.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lab24.Lab24.entity.Items;



public interface ItemRepository extends JpaRepository<Items, Integer> {
	
	

}
