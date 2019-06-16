package com.vdsi.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.vdsi.springbootsoapwsexample.Employee;

@Service
public class EmployeeService {

	Map<String,Employee> listEmp=new HashMap<String,Employee>();
	
	public EmployeeService() {
		
		Employee employee=new Employee();
		employee.setEid("1");
		employee.setEname("Jagadeesh");
		employee.setEsalary(12000);
		
		Employee employee1=new Employee();
		employee1.setEid("2");
		employee1.setEname("mahi");
		employee1.setEsalary(22000);
		
		Employee employee11=new Employee();
		employee11.setEid("3");
		employee11.setEname("venu");
		employee11.setEsalary(72000);
		
		listEmp.put(employee.getEname(),employee);
		listEmp.put(employee1.getEname(),employee1);
		listEmp.put(employee11.getEname(),employee11);
		
	
	}
	
	public Employee getEmployeedetails(String name) {
		return listEmp.get(name);
	}

	
	
	
}
