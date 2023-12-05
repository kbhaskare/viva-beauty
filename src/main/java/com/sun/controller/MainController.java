package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView home()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("index");
		System.out.println("Exit from home");
		return retVal;
	}

}
