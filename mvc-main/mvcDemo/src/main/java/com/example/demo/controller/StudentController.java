package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String dem()
	{
		return "index.jsp";
	}
	
	
	@RequestMapping("/print")
	public String demo(String name,HttpSession session)
	{
		//String name=req.getParameter("name");
		//System.out.println(name);
		session.setAttribute("username",name);
		return "index.jsp";
	}
	
}
