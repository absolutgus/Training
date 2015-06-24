package com.absolutgus.staffmanagement.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.absolutgus.staffmanagement.domain.Employee;

@Stateless
public class EmployeeDataAccessImplementation implements EmployeeDataAccess
{

	public List<Employee> findAll() {
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.add(new Employee("Richard", "Chesterwood", "Presenter", 10));
		tempList.add(new Employee("Matthew", "Admin", "Producer", 10000));
		return tempList;
	}

	public List<Employee> findBySurname(String surname) {
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.add(new Employee("Temp", "Temp", "Temp", 10000));
		return tempList;
	}

	public void insert(Employee newEmployee) {
		// TODO Auto-generated method stub		
	}

}
