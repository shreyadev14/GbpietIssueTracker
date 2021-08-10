package com.GIT.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.GIT.dao.DepartmentRepository;
import com.GIT.dao.IssueRepository;
import com.GIT.dao.ReporterRepository;
import com.GIT.entities.Department;
import com.GIT.entities.Issues;
import com.GIT.entities.Reporter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller
@RequestMapping("/Issues")
public class IssueController {
 
	@Autowired
	IssueRepository isRepo;
	
	@Autowired
	ReporterRepository repRepo;
	
	@Autowired
    DepartmentRepository depRepo;
	
	@GetMapping("/newIssue")
	public String createIssue(Model model) {
        Issues issue=new Issues();
		model.addAttribute("issue",issue);
		
    	List<Department> dept=depRepo.findAll();
    	model.addAttribute("departments", dept);
    	
    	List<Reporter> rep =repRepo.findAll();
    	model.addAttribute("reporters",rep);
		
    	return "Issues/createIssue";
		
 }	

   @PostMapping("/save")	
  public String persistingIssue(Issues issue,Model model )
  {
	   isRepo.save(issue);
	   
	   return "redirect:/Issues/display";
	  
  }
  
   @GetMapping("/display")
   public String displayIssue(Model model) {
	   List<Issues>allIssues=isRepo.findAll();
	   model.addAttribute("allIssues",allIssues);
	   return "Issues/displayIssue";
   }


}
