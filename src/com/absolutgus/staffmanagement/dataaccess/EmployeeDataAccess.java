package com.absolutgus.staffmanagement.dataaccess;

import java.util.List;

import com.absolutgus.staffmanagement.domain.Employee;

public interface EmployeeDataAccess {

	public abstract List<Employee> findAll();

	public abstract List<Employee> findBySurname(String surname);

	public abstract void insert(Employee newEmployee);

}