package com.itktechnologies.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormToUpperCase")
	public String toUpperCase(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("studentName");
		
		model.addAttribute("message", studentName.toUpperCase());
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormUsingRequestParam")
	public String getRequestParam(@RequestParam("studentName") String studentName, Model model) {
		
		
		model.addAttribute("message", studentName.concat("-> example of RequestParam annotation"));
		
		return "helloworld";
	}
	

}