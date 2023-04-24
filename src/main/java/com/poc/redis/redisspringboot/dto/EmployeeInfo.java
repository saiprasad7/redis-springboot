package com.poc.redis.redisspringboot.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class EmployeeInfo implements Serializable {
	
 private static final long serialVersionUID = -7999224776021728682L;

	Integer id;
	String name;
	String department;
	String projectDuration;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
