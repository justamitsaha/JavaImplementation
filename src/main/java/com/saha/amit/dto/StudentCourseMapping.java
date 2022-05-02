package com.saha.amit.dto;

import java.io.Serializable;

public class StudentCourseMapping implements Serializable{
    /**                                                                        
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String dept;
    private Integer roll;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
