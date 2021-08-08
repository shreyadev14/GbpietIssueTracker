package com.GIT.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GIT.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department,String> 
{
  
  public List<Department>findAll();
}
