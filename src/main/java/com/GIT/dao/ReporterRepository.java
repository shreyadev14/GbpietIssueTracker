package com.GIT.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GIT.entities.Reporter;

public interface ReporterRepository extends CrudRepository<Reporter,String> {

	public List<Reporter> findAll();
}
