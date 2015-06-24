package com.absolutgus.staffmanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EMPL")
public class Employee implements java.io.Serializable
{
	/**
	 * Required by serializible
	 */
	private static final long serialVersionUID = 6892354920458220795L;
	 	 	  	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="VC_FIRST")
	private String firstName;
	private String surname;
	private String jobRole;
	private int salary;
	
	// required by JPA; not used
	public Employee(){		
	}
	
	public Employee(String firstName, String surname, String jobRole, int salary) 
	{
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.jobRole = jobRole;
		this.salary = salary;
	}

	public String toString()
	{
		return "Employee " + this.firstName + " " + this.surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
