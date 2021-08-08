package com.GIT.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.GIT.dao.ReporterRepository;
import com.GIT.entities.Reporter;

@Controller
@RequestMapping("/Reporter")
public class ReporterController {
	
	@Autowired
	ReporterRepository rep;

	@GetMapping("newReporter")
	public String createReporter() 
	{
	 return "Reporter/createReporter";	
	}

@GetMapping("/allReporter")
public String  showAllReporter(Model model)
{
	List<Reporter> reporters=rep.findAll();
	
	model.addAttribute("reporters", reporters);
	return "Reporter/allReporter";
}


}

