package com.cg.ems.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.cg.ems.dao.IEmployeeRepository;
import com.cg.ems.entity.EmployeeBean;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;

	public EmployeeServiceImpl() {
		System.out.println("SERVICE IMPL");
	}

	// Add Employee
	@Transactional
	@Override
	public void addEmployee(EmployeeBean employee) {
		employeeRepository.save(employee);
	}

	// Get Employee
	@Override
	public EmployeeBean getEmployee(int empId) {
		EmployeeBean employee = employeeRepository.findById(empId).get();
		return employee;
	}

	// GetAll Employee
	@Override
	public List<EmployeeBean> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// Update Employee
	@Transactional
	@Override
	public void updateEmployee(EmployeeBean employee) {
//		EmployeeBean empBean = employeeRepository.findById(employee.getEmployeeId()).get();
//		empBean.setEmployeeId(employee.getEmployeeId());
		employeeRepository.save(employee);
	}

	// Delete Employee
	@Transactional
	@Override
	public void deleteEmployee(int empId) {
		EmployeeBean employee = employeeRepository.findById(empId).get();
		employeeRepository.delete(employee);
	}
}
