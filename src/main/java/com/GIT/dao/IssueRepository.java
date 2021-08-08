package com.GIT.dao;

import org.springframework.data.repository.CrudRepository;

import com.GIT.entities.Issues;

public interface IssueRepository extends CrudRepository<Issues,Long> {

}
