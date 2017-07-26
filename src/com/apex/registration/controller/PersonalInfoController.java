package com.apex.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.registration.bo.UserService;
import com.apex.registration.vo.User;

//
//import com.apex.registration.bo.UserService;
//import com.apex.registration.vo.User;
@Controller
@SessionAttributes("userBean")
public class PersonalInfoController {
	@Autowired
	private UserService userService=null;
	@RequestMapping("/displayregistration.do")
	public String displayPage(Model model){
		User userBean= new User();
		model.addAttribute("userBean",userBean);
		return "personalinfo";
	}
	
	@RequestMapping("/addContactInfo.do")
	public String addContactInfo(@ModelAttribute("userBean") User user){
		//step1
		
		System.out.println("PersonalInfoController:addContactInfo -- Start");
		System.out.println("First Name:"+user.getFirstName());
		
		//step2
		 
		//userService.registerUser(user);
		
		//step3
		System.out.println("PersonalInfoController:addContactInfo -- End");
		return "contactinfo";
	}
	
	@RequestMapping("/addBankInfo.do")
	public String addIBankInfo(@ModelAttribute("userBean") User user){
		//step1
		System.out.println("PersonalInfoController:addBankInfo -- Start");
		System.out.println("First Name:"+user.getFirstName());
		System.out.println("Address:"+user.getAddress());
		//step2
		 
		
		
		//step3
		System.out.println("PersonalInfoController:addIBankInfo -- End");
		return "bankinfo";
	}
	
	@RequestMapping("/displaySuccess.do")
	public String displayAllInfo(@ModelAttribute("userBean") User user){
		userService.registerUser(user);
		return "outputsuccess";
	}
	

}







	
	
	


