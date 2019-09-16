package com.cg.emp.service;
import java.util.*;

 

import javax.transaction.Transactional;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.cg.emp.beans.Employee;
import com.cg.emp.dao.EmployeeDao;
import com.cg.emp.exception.EmployeeException;
@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDao employeeDao;
    
    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {
        return employeeDao.getAllEmployees();
    }

 

    @Override
    public List<Employee> deleteEmployee(int id) throws EmployeeException {
        
        return employeeDao.deleteEmployee(id);
    }



	@Override
	public List<Employee> addEmployee(Employee emp) throws EmployeeException {
		
		return employeeDao.addEmployee(emp);
	}
}