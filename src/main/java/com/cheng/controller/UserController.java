package com.cheng.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cheng.domain.User;
import com.cheng.service.intf.UserService;

@Controller  
@RequestMapping("/user")  
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUser")  
    public ModelAndView toIndex(){  
        List<User> userList = this.userService.findAll();  
        //model.addAttribute("user", userList.get(0));  
        ModelAndView mad = new ModelAndView("showusers");
        mad.addObject("user",userList.get(0));
        return mad;  
    }  
	
	@RequestMapping("/addUser")  
    public ModelAndView toUsers(){  
		List<User> users = new ArrayList<User>();
		User user1 = new User();
//		user1.setId(2);
		user1.setUserName("user1");
		user1.setPassword("123456");
		user1.setAge(20);
		users.add(user1);
        /*User user2 = new User();
		user2.setId(2);
		user2.setUserName("user2");
		user2.setPassword("123456");
		user2.setAge(18);
		users.add(user2);*/
		userService.insertUsers(users);
        List<User> userList = this.userService.findAll();  
        //model.addAttribute("user", userList.get(0));  
        ModelAndView mad = new ModelAndView("showusers");
        mad.addObject("users",userList);
        return mad;
    } 
}
