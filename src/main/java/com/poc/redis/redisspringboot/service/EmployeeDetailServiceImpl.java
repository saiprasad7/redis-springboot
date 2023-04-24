package com.poc.redis.redisspringboot.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import com.poc.redis.redisspringboot.dto.EmployeeInfo;

@Repository
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

	private final String hashReference= "EmployeeInfo";

    @Resource(name="redisTemplate")
    private HashOperations<String, Integer, EmployeeInfo> hashOperations;
    
	
	@Override
	public EmployeeInfo saveEmployee(EmployeeInfo emp) {
		// TODO Auto-generated method stub
		 hashOperations.putIfAbsent(hashReference,emp.getId(), emp);
		return emp;
	    
	}

	@Override	
	public EmployeeInfo getEmployeeInfo(Integer id) {
		// TODO Auto-generated method stub
		return hashOperations.get(hashReference, id);         		  
	}
	

	@Override
	public Map<Integer, EmployeeInfo> getAllEmployeesInfo() {
		// TODO Auto-generated method stub
		return hashOperations.entries(hashReference);
	}

}
