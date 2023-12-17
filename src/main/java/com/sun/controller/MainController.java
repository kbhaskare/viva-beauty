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
	
	@RequestMapping(value="/index.html", method = RequestMethod.GET)
	public ModelAndView home1()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("index");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/about.html", method = RequestMethod.GET)
	public ModelAndView about()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("about");
		System.out.println("Exit from home");
		return retVal;
	} 	
	
	@RequestMapping(value="/service.html", method = RequestMethod.GET)
	public ModelAndView service()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("service");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/price.html", method = RequestMethod.GET)
	public ModelAndView price()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("price");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/contact.html", method = RequestMethod.GET)
	public ModelAndView contact()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("contact");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/team.html", method = RequestMethod.GET)
	public ModelAndView team()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("team");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/testimonial.html", method = RequestMethod.GET)
	public ModelAndView testimonial()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("testimonial");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/gallery.html", method = RequestMethod.GET)
	public ModelAndView gallery()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("gallery");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/appointment.html", method = RequestMethod.GET)
	public ModelAndView appointment()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("appointment");
		System.out.println("Exit from home");
		return retVal;
	}
	
	@RequestMapping(value="/404.html", method = RequestMethod.GET)
	public ModelAndView page404()
   {
		System.out.println("Entry into home");
		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("404");
		System.out.println("Exit from home");
		return retVal;
	}
	
	

}
