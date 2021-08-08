package com.GIT.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reporter {
	@Id
	private String R_Enroll_No;
	private String R_Name;
	private String R_Father_Name;
	private String R_Branch;
	private String R_Semester;
	private Integer R_Year;
	private String R_Email;
	private String R_Mobile;
	
	@OneToMany(mappedBy="ISSUE_REPORTER")
	private List<Issues> R_Issues;
	
	public Reporter()
	{}
	
	
	public Reporter(String r_Enroll_No, String r_Name, String r_Father_Name, String r_Branch, String r_Semester,
			Integer r_Year, String r_Email, String r_Mobile) {
		super();
		R_Enroll_No = r_Enroll_No;
		R_Name = r_Name;
		R_Father_Name = r_Father_Name;
		R_Branch = r_Branch;
		R_Semester = r_Semester;
		R_Year = r_Year;
		R_Email = r_Email;
		R_Mobile = r_Mobile;
	}
	
	
	public String getR_Enroll_No() {
		return R_Enroll_No;
	}
	public String getR_Name() {
		return R_Name;
	}
	public String getR_Father_Name() {
		return R_Father_Name;
	}
	public String getR_Branch() {
		return R_Branch;
	}
	public String getR_Semester() {
		return R_Semester;
	}
	public Integer getR_Year() {
		return R_Year;
	}
	public String getR_Email() {
		return R_Email;
	}
	public String getR_Mobile() {
		return R_Mobile;
	}
	public void setR_Enroll_No(String r_Enroll_No) {
		R_Enroll_No = r_Enroll_No;
	}
	public void setR_Name(String r_Name) {
		R_Name = r_Name;
	}
	public void setR_Father_Name(String r_Father_Name) {
		R_Father_Name = r_Father_Name;
	}
	public void setR_Branch(String r_Branch) {
		R_Branch = r_Branch;
	}
	public void setR_Semester(String r_Semester) {
		R_Semester = r_Semester;
	}
	public void setR_Year(Integer r_Year) {
		R_Year = r_Year;
	}
	public void setR_Email(String r_Email) {
		R_Email = r_Email;
	}
	public void setR_Mobile(String r_Mobile) {
		R_Mobile = r_Mobile;
	}

}
