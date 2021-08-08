package com.GIT.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Issues {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="issues_seq")
	@SequenceGenerator(name ="issues_seq", sequenceName ="issues_seq",
    allocationSize = 1,initialValue=1)
	private long ISSUE_ID;
	
	private String ISSUE_TITLE;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date ISSUE_CREATION;
	
	private String ISSUE_DESCRIPTION;
	
	private String ISSUE_STATUS;
	
	private int ISSUE_VOTES;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
			fetch=FetchType.LAZY)
	@JoinColumn(name="ISSUE_DEPARTMENT")
	private Department ISSUE_DEPARTMENT;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
			fetch=FetchType.LAZY)
	@JoinColumn(name="ISSUE_REPORTER")
	private Reporter ISSUE_REPORTER;

	public Issues() {};
	
	
	
	public Issues(String iSSUE_TITLE, Date iSSUE_CREATION, String iSSUE_DESCRIPTION, String iSSUE_STATUS,
			int iSSUE_VOTES, Department iSSUE_DEPARTMENT, Reporter iSSUE_REPORTER) {
		super();
		ISSUE_TITLE = iSSUE_TITLE;
		ISSUE_CREATION = iSSUE_CREATION;
		ISSUE_DESCRIPTION = iSSUE_DESCRIPTION;
		ISSUE_STATUS = iSSUE_STATUS;
		ISSUE_VOTES = iSSUE_VOTES;
		ISSUE_DEPARTMENT = iSSUE_DEPARTMENT;
		ISSUE_REPORTER = iSSUE_REPORTER;
	}


	public long getISSUE_ID() {
		return ISSUE_ID;
	}

	public String getISSUE_TITLE() {
		return ISSUE_TITLE;
	}

	public Date getISSUE_CREATION() {
		return ISSUE_CREATION;
	}

	public String getISSUE_DESCRIPTION() {
		return ISSUE_DESCRIPTION;
	}

	public String getISSUE_STATUS() {
		return ISSUE_STATUS;
	}

	public int getISSUE_VOTES() {
		return ISSUE_VOTES;
	}

	public Department getISSUE_DEPARTMENT() {
		return ISSUE_DEPARTMENT;
	}

	public Reporter getISSUE_REPORTER() {
		return ISSUE_REPORTER;
	}

	public void setISSUE_ID(long iSSUE_ID) {
		ISSUE_ID = iSSUE_ID;
	}

	public void setISSUE_TITLE(String iSSUE_TITLE) {
		ISSUE_TITLE = iSSUE_TITLE;
	}

	
   public void setISSUE_DESCRIPTION(String iSSUE_DESCRIPTION) {
		ISSUE_DESCRIPTION = iSSUE_DESCRIPTION;
	}

	public void setISSUE_STATUS(String iSSUE_STATUS) {
		ISSUE_STATUS = iSSUE_STATUS;
	}

	public void setISSUE_VOTES(int iSSUE_VOTES) {
		ISSUE_VOTES = iSSUE_VOTES;
	}
		
	public void setISSUE_DEPARTMENT(Department iSSUE_DEPARTMENT) {
		ISSUE_DEPARTMENT = iSSUE_DEPARTMENT;
	}

	public void setISSUE_REPORTER(Reporter iSSUE_REPORTER) {
		ISSUE_REPORTER = iSSUE_REPORTER;
	}
	
	@PrePersist
	 public void IssueCreation() {
		this.ISSUE_CREATION=new Date();
		}

}

	
	

