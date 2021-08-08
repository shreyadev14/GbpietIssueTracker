CREATE TABLE IF NOT EXISTS Department(
D_ID VARCHAR(100) NOT NULL PRIMARY KEY,
D_Name VARCHAR(100) NOT NULL
 );

CREATE TABLE IF NOT EXISTS Reporter(
R_Enroll_No VARCHAR (100) NOT NULL PRIMARY KEY,
R_Name VARCHAR (100) NOT NULL,
R_Father_Name VARCHAR (100) NOT NULL 
R_Semester VARCHAR (100) NOT NULL,
R_Year VARCHAR (100)NOT NULL ,
R_Email VARCHAR (100) NOT NULL,
R_Mobile VARCHAR (100) NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS issues_seq;

CREATE TABLE IF NOT EXISTS Issues(
ISSUE_ID BIGINT NOT NULL DEFAULT nextval('issues_seq') PRIMARY KEY,
ISSUE_TITLE VARCHAR(100) NOT NULL,
ISSUE_CREATION DATE NOT NULL,
ISSUE_DESCRIPTION VARCHAR(1000) NOT NULL,
ISSUE_STATUS VARCHAR(100) NOT NULL,
ISSUE_VOTES INTEGER NOT NULL,
ISSUE_DEPARTMENT VARCHAR (100) NOT NULL REFERENCES Department,
ISSUE_REPORTER VARCHAR (100) NOT NULL REFERENCES Reporter
);

