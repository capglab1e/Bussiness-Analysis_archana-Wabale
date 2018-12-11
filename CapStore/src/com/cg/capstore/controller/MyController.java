package com.cg.capstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.service.ICapstoreService;



@Controller	
public class MyController {
	
	@Autowired
	ICapstoreService capservice;
	
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String basic()
	{
		System.out.println("in all");
		return "home";
		
	}
	
	@RequestMapping(value="display", method=RequestMethod.GET)
	public ModelAndView reportqty(@RequestParam("product_name") String prodName,Model model)
	{
		System.out.println("display");
		int soldqty = capservice.quantity(prodName);
		double rev = capservice.revenue(soldqty,prodName);
		model.addAttribute("qty",soldqty);
		model.addAttribute("rev",rev);
		
		return new ModelAndView("qtypage");
		
	}
	
	
	
	
	
}
