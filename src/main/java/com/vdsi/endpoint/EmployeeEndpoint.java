package com.vdsi.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.vdsi.service.EmployeeService;
import com.vdsi.springbootsoapwsexample.Employee;
import com.vdsi.springbootsoapwsexample.GetEmployeeDetailsRequest;
import com.vdsi.springbootsoapwsexample.GetEmployeeDetailsResponse;

@Endpoint
public class EmployeeEndpoint {
	
	private final static String namespace="http://vdsi.com/springbootsoapwsexample";
	
	@Autowired
	private EmployeeService employeeService;
	
	@PayloadRoot(namespace =namespace,localPart ="getEmployeeDetailsRequest")
	@ResponsePayload
	public GetEmployeeDetailsResponse getEmployeeDetailsReques(@RequestPayload GetEmployeeDetailsRequest req) {
		GetEmployeeDetailsResponse getEmployeeDetailsResponse=new GetEmployeeDetailsResponse();
		Employee emp=employeeService.getEmployeedetails(req.getEname());
		getEmployeeDetailsResponse.setEmployee(emp);
		return getEmployeeDetailsResponse;
	}
	
}
