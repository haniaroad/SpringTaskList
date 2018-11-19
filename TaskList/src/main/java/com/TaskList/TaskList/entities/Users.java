package com.TaskList.TaskList.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "users")
public class Users {

	private String email;
	private String password;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	
	@OneToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
	private List<Task> tasks = new ArrayList<>();
	
	
	public Users() {
	
	}

	public Users(String email, String password, Integer userid) {
		this.email = email;
		this.password = password;
		this.userid = userid;
	}
	
	public Users (String email, String password) {
		this.email = email;
		this.password = password;
	
	}

	@Override
	public String toString() {
		return "Users [email=" + email + ", password=" + password + ", userid=" + userid + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	

}
