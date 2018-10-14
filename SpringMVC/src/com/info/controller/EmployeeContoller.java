package com.info.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeContoller {

	@RequestMapping("/create.htm")
	public void addEmployee(HttpServletRequest request){
		System.out.println("addEmployee");
	}
	
	@RequestMapping("/login.htm")
	public void checkEmployee(){
		System.out.println("checkEmployee");
	}
	
	public void getAllEmployees(){
		
	}

	public void deleteEmployees(){
		
	}
	
}
