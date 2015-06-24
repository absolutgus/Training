package com.absolutgus.staffmanagement;

import java.util.List;

import javax.ejb.Remote;

import com.absolutgus.staffmanagement.domain.Employee;

@Remote
public interface EmployeeManagementService 
{
	public void registerEmployee(Employee newEmployee);
	public List<Employee> getAllEmployees();
	public List<Employee> searchBySurname(String surname);
}
