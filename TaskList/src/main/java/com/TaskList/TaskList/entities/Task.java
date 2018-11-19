package com.TaskList.TaskList.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

	private String description;
	private String duedate;
	private String complete;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskid;
	
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private Task tasks;
	
	@Override
	public String toString() {
		return "Task [description=" + description + ", duedate=" + duedate + ", complete=" + complete + ", taskid="
				+ taskid + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public Task() {

	}

	public Task(String description, String duedate, String complete, int taskid) {
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		this.taskid = taskid;
	}
	
	public Task(String description, String duedate, String complete) {
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		
	}




}
