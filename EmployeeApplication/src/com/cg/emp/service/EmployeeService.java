package com.cg.emp.service;

import java.util.List;

import com.cg.emp.beans.Employee;
import com.cg.emp.exception.EmployeeException;

public interface EmployeeService {
	List<Employee> getAllEmployees() throws EmployeeException;
	List<Employee> deleteEmployee(int id) throws EmployeeException;
	List<Employee> addEmployee(Employee emp) throws EmployeeException;
	

}
