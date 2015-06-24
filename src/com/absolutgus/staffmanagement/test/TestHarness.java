package com.absolutgus.staffmanagement.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.absolutgus.staffmanagement.domain.Employee;

public class TestHarness {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeDb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee employee1 = new Employee("Fred","Jones","Waterboy",10000);
		em.persist(employee1);

//		Employee employee1 = em.find(Employee.class, 1);
//		if( employee1 != null ) {
//			employee1.setSurname("Purple");
//		}
		
		
//		System.out.println(employee1);
		
		tx.commit();
		
		em.close();
	}

}
