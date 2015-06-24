package com.absolutgus.staffmanagement;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.absolutgus.staffmanagement.dataaccess.EmployeeDataAccess;
import com.absolutgus.staffmanagement.domain.Employee;

@Stateless
public class EmployeeManagementImplementation implements
		EmployeeManagementService {

	@EJB
	private EmployeeDataAccess dao;

	public List<Employee> getAllEmployees() 
	{
		return dao.findAll();
	}

	public void registerEmployee(Employee newEmployee) {
		dao.insert(newEmployee);
	}

	public List<Employee> searchBySurname(String surname) {
		return dao.findBySurname(surname);
	}
	
}
