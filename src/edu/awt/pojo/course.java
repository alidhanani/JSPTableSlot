package edu.awt.pojo;

public class course {
	int courseid;
	String sectionname;
	String faculty;
	String coursename;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getSectionname() {
		return sectionname;
	}
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public course(int courseid, String sectionname, String faculty, String coursename) {
		this.courseid = courseid;
		this.sectionname = sectionname;
		this.faculty = faculty;
		this.coursename = coursename;
	}
	public course() {
	}
	
}
