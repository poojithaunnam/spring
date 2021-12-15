package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.demo.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

	@Autowired
	EmpService service;

	@RequestMapping("/")
	public ModelAndView dem(ModelAndView mv) {
		mv.setViewName("index.jsp");
		//List<Employee> list = service.getEmployees();
		//mv.addObject("all", list);
		return mv;
	}
	
	@RequestMapping("/print")
	public ModelAndView demo(@RequestParam("name") String name, ModelAndView mv)
	{

		mv.setViewName("welcome.jsp");
		mv.addObject("username",name);
		return mv;
	}

	@RequestMapping("/save")
	public ModelAndView empsave(ModelAndView mv, Employee emp)
	{
		service.saveEmp(emp);
		mv.setViewName("welcome.jsp");
		List<Employee> list = service.getEmployees();
		System.out.println(emp);
		mv.addObject("all",list);

		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView empdel(ModelAndView mv , Employee emp)
	{   	mv.setViewName("delete.jsp");

		return mv;
	}
	@RequestMapping("/sumpage")
	public String cal()
	{
		return "cal.jsp";

	}
@RequestMapping("/add")
	public ModelAndView addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView ml)
{
	ml.setViewName("cal.jsp");
	int sum = num1+num2;
	ml.addObject("sum",sum);
	return ml;
}

}
