package com.saha.amit.dto;

import java.io.Serializable;
import java.util.List;


public class StudentCourseList implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<StudentCourseMapping> studentCourseMapping;
	public List<StudentCourseMapping> getStudentCourseMapping() {
		return studentCourseMapping;
	}
	public void setStudentCourseMapping(List<StudentCourseMapping> studentCourseMapping) {
		this.studentCourseMapping = studentCourseMapping;
	}


}
