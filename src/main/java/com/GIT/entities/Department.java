package com.GIT.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private String D_ID;
	private String D_Name;
	
	@OneToMany(mappedBy="ISSUE_DEPARTMENT")
	private List<Issues>D_Issues;
	
	public Department(){}
	
	public Department(String d_ID, String d_Name) {
		super();
		D_ID = d_ID;
		D_Name = d_Name;
	}
	public String getD_ID() {
		return D_ID;
	}
	public String getD_Name() {
		return D_Name;
	}
	public void setD_ID(String d_ID) {
		D_ID = d_ID;
	}
	public void setD_Name(String d_Name) {
		D_Name = d_Name;
	}

}
