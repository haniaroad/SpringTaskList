package com.TaskList.TaskList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.TaskList.TaskList.entities.Task;
import com.TaskList.TaskList.entities.Users;
import com.TaskList.TaskList.repositories.TaskRepository;
import com.TaskList.TaskList.repositories.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	TaskRepository t;
	
	@Autowired
	UserRepository u;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index");

	}
	
	@RequestMapping("register")
	public ModelAndView register() {

		return new ModelAndView("register");

	}
	
	@RequestMapping("tasklist")
	public ModelAndView taskList() {
		if(u.existsById(1)) {
			return new ModelAndView("tasklist");
		} else if (!u.existsById(1)) { 
			
			return new ModelAndView("redirect:/");
		}
		return null;
		 
	}
	
	@RequestMapping("showtasks")
	public ModelAndView teamAdmin() {
		
		return new ModelAndView("tasklist", "taskList", t.findAll());

	}

	@RequestMapping("createuser") //Works
	public ModelAndView createUser(@RequestParam("email")String email, @RequestParam("password")String password) {
		Users newUser = new Users(email, password);
		u.save(newUser);
		return new ModelAndView("tasklist"); //Slash here represents the index page
	}
	
	@RequestMapping("addtask")
		public ModelAndView addTask(@RequestParam("description")String description, @RequestParam("due")String due, @RequestParam("complete")String complete) {
		Task newTask = new Task(description, due, complete);
		t.save(newTask);
		return new ModelAndView("redirect:/tasklist");

	}


}
