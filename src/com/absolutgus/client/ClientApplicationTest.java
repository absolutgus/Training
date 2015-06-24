package com.absolutgus.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.absolutgus.staffmanagement.EmployeeManagementService;
import com.absolutgus.staffmanagement.domain.Employee;

public class ClientApplicationTest {

	public static void main(String[] args) {
		try
		{
			Context jndi = new InitialContext();
			
// Glassfish specific lookup			
//			EmployeeManagementService service = (EmployeeManagementService) jndi.lookup("com.absolutgus.staffmanagement.EmployeeManagementService");

// Standard lookup			
			EmployeeManagementService service = (EmployeeManagementService) jndi.lookup("java:global/EmployeeManagement/EmployeeManagementImplementation");
			
			List<Employee> employees = service.getAllEmployees();
			
			for(Employee i : employees )
			{
				System.out.println(i);
			}
			
		}
		catch(NamingException e)
		{
			System.out.println(e);
		}
	}

}
