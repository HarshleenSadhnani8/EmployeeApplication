package com.cg.emp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.emp.beans.Employee;
import com.cg.emp.exception.EmployeeException;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
		@PersistenceContext
		EntityManager entityManager;
		
	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			TypedQuery<Employee> query=entityManager.createQuery("from Employee order by id",Employee.class);
			List<Employee> employees=query.getResultList();
			return employees;
		} catch (Exception e) {
		throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> deleteEmployee(int id) throws EmployeeException {
		try {
			Employee emp=entityManager.find(Employee.class, id);
			entityManager.remove(emp);
			return getAllEmployees();
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> addEmployee(Employee emp) throws EmployeeException {
		try {
			entityManager.persist(emp);
			return getAllEmployees();
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

}
