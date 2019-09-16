package com.cg.emp.dao;

import java.util.List;

import com.cg.emp.beans.Employee;
import com.cg.emp.exception.EmployeeException;

public interface EmployeeDao {
	List<Employee> getAllEmployees() throws EmployeeException;
	List<Employee> deleteEmployee(int id) throws EmployeeException;
	List<Employee> addEmployee(Employee emp) throws EmployeeException;
}
