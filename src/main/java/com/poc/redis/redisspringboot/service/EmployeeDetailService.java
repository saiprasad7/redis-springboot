package com.poc.redis.redisspringboot.service;

import java.util.Map;


import com.poc.redis.redisspringboot.dto.EmployeeInfo;

public interface EmployeeDetailService {
	
	public EmployeeInfo saveEmployee(EmployeeInfo emp);    
    public EmployeeInfo getEmployeeInfo(Integer employee) throws Exception;
    public Map<Integer, EmployeeInfo> getAllEmployeesInfo();

}
