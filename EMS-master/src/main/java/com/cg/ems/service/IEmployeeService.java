package com.cg.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ems.entity.EmployeeBean;

public interface IEmployeeService {

	void addEmployee(EmployeeBean employee);

	EmployeeBean getEmployee(int empId);

	List<EmployeeBean> getAllEmployees();

	void updateEmployee(EmployeeBean employee);

	void deleteEmployee(int empId);

}
