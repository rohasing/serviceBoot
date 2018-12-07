import { Component, OnInit, Input } from '@angular/core';
import { Employee } from "../employee";
import { EmployeeService } from "../employee.service";
import { Router } from '@angular/router';
@Component({
  selector: 'app-employee-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
  providers: [EmployeeService]
})
export class EmployeeListComponent implements OnInit {
  private employees: Employee[];
  constructor(private router: Router,
  private employeeService: EmployeeService) { }

  ngOnInit() {
    this.getAllEmployees();
  }

getAllEmployees() {
 this.employeeService.findAll().then(
 employees => {
 this.employees = employees;
 },
 err => {
 console.log(err);
 }
);
 }
createEmployee() {
 let employeeId = (<HTMLInputElement>document.getElementById('employeeId')).value;
 let employeeName = (<HTMLInputElement>document.getElementById('employeeName')).value;
 let employeePAN = (<HTMLInputElement>document.getElementById('employeePAN')).value;
 let employeeDesignation = (<HTMLInputElement>document.getElementById('employeeDesignation')).value;
 let employeeDomain = (<HTMLInputElement>document.getElementById('employeeDomain')).value;
 let employeeDOJ = (<HTMLInputElement>document.getElementById('employeeDOJ')).value;
 let employeeDOB = (<HTMLInputElement>document.getElementById('employeeDOB')).value;
 let employeeSalary = (<HTMLInputElement>document.getElementById('employeeSalary')).value;
 let employeeMailId = (<HTMLInputElement>document.getElementById('employeeMailId')).value;
 let employeePassword = (<HTMLInputElement>document.getElementById('employeePassword')).value;
 let employee = new Employee(Number(employeeId), employeeName, employeePAN, employeeDesignation, employeeDomain , employeeDOJ, employeeDOB , Number(employeeSalary), employeeMailId, employeePassword);
 this.employeeService.createEmployee(employee).then(
 employees => {
 this.employees = employees;
 },
 err => {
 console.log(err);
 }
 );
 }
deleteEmployee(employee: Employee) {
 this.employeeService.deleteEmployeeById(employee.employeeId).then(
 employees => {
 this.employees = employees;
 },
 err => {
 console.log(err);
 }
 );
 }
}

