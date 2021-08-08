package com.GIT.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.GIT.dao.DepartmentRepository;
import com.GIT.entities.Department;

@Controller
@RequestMapping("/Department")
public class DepartmentController {
   
    @Autowired 
	DepartmentRepository depRepo; 	
	
     @GetMapping("newDepartment")
	public String createDepartment() {
		return "Department/createDepartment";
		
	}
	
	@GetMapping("/allDepartment")
	public String showAllDepartment(Model model) 
	
	{  
	    List<Department> allDept= depRepo.findAll(); 
		
		
	    model.addAttribute("allDept",allDept);
	    
	    return "Department/allDepartment";	
	
	}
		
	
	
	
}
