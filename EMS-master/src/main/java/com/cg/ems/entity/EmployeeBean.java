package com.cg.ems.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name = "employeeNew")
public class EmployeeBean {

	public EmployeeBean() {
		System.out.println("BEAN BEAN");
	}

	@Id
	int employeeId;

	String employeeName;

	String employeePAN;

	String employeeDesignation;

	String employeeDomain;

	LocalDate employeeDOJ;

	LocalDate employeeDOB;

	double employeeSalary;

	String employeeMailId;

	String employeePassword;

	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePAN="
				+ employeePAN + ", employeeDesignation=" + employeeDesignation + ", employeeDomain=" + employeeDomain
				+ ", employeeDOJ=" + employeeDOJ + ", employeeDOB=" + employeeDOB + ", employeeSalary=" + employeeSalary
				+ ", employeeMailId=" + employeeMailId + ", employeePassword=" + employeePassword + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePAN() {
		return employeePAN;
	}

	public void setEmployeePAN(String employeePAN) {
		this.employeePAN = employeePAN;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeDomain() {
		return employeeDomain;
	}

	public void setEmployeeDomain(String employeeDomain) {
		this.employeeDomain = employeeDomain;
	}

	public LocalDate getEmployeeDOJ() {
		return employeeDOJ;
	}

	public void setEmployeeDOJ(LocalDate employeeDOJ) {
		this.employeeDOJ = employeeDOJ;
	}

	public LocalDate getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(LocalDate employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeMailId() {
		return employeeMailId;
	}

	public void setEmployeeMailId(String employeeMailId) {
		this.employeeMailId = employeeMailId;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

}
