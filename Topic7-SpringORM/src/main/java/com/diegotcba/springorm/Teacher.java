package com.diegotcba.springorm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	
	@OneToMany(mappedBy="assignedTeacher", fetch = FetchType.EAGER)
	private Set<Course> courses=new HashSet<Course>();

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	private Date dateBirth;
	
	protected Teacher()
	{
		//JPA only
	}
	
	public Teacher(String firstName, String lastName, Date dateBirth)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateBirth=dateBirth;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	public String toString()
	{
		return lastName + ", " + firstName + " [" + new SimpleDateFormat("dd/MM/yyyy").format(dateBirth) + "]";
	}
	
	public Set<Course> getCourses()
	{
		return courses;
	}
}
