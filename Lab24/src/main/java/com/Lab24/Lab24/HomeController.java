package com.Lab24.Lab24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Lab24.Lab24.dao.ItemRepository;
import com.Lab24.Lab24.entity.Items;






@Controller
public class HomeController {
	
	@Autowired
	ItemRepository i;

	@RequestMapping("/")
	public ModelAndView index() {
		
		return new ModelAndView("index", "itemList", i.findAll());

	}
	
	@RequestMapping("additem")
	public ModelAndView addNewItem(@RequestParam("Name")String name, @RequestParam("Description") String description, @RequestParam("Quantity") int quantity, @RequestParam("Price")int price){
		
		Items newItem = new Items(name, description, quantity, price);
		i.save(newItem);
		return new ModelAndView("redirect:/"); //Slash here represents the index page
	}
	
	@RequestMapping("edititem")
	public ModelAndView editItem(@RequestParam("itemid")String pId) {
		return new ModelAndView("edititem", "id", pId);
	}
	
	@RequestMapping("updateitem")
	public ModelAndView updatePerson(Items item){ //This will work exactly like addNewPerson method but does not require @RequestParam because we are passing an entire person object. Look at update-form.jsp to see the difference in how to set up the form to make this happen.
	
		i.save(item);
		return new ModelAndView("redirect:/"); //Slash here represents the index page
	}
	

	@RequestMapping("delete")
	public ModelAndView removeitem(@RequestParam("itemid")int id) {
		i.deleteById(id);
		return new ModelAndView("redirect:/");
	}
	

	

}
