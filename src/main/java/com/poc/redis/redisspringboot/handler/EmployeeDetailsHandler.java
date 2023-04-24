package com.poc.redis.redisspringboot.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.redis.redisspringboot.dto.EmployeeInfo;
import com.poc.redis.redisspringboot.service.EmployeeDetailService;

@RestController
@RequestMapping("/emp")
public class EmployeeDetailsHandler {
	
	@Autowired
	public EmployeeDetailService employeeDetailService;

    @PostMapping("/saveEmp")
    public EmployeeInfo saveEmpDetail(@RequestBody EmployeeInfo emp) {
       return employeeDetailService.saveEmployee(emp);
    }
    
    @GetMapping("/getEmp/{id}")
    public EmployeeInfo getEmployeeInfo(@PathVariable Integer id) throws Exception {
       return employeeDetailService.getEmployeeInfo(id);
    }
	
	
	@GetMapping("/allEmp") 
    public Map<Integer, EmployeeInfo> getAllEmployeesInfo(){
       return(employeeDetailService.getAllEmployeesInfo());
    }

}
