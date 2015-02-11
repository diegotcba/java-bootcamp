package com.diegotcba.springorm;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="idCourse")
	private long id;
	private String name;
	private int hoursWeek;
	@ManyToOne
	private Teacher assignedTeacher;
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="Course_Student", 
            joinColumns=@JoinColumn(name="idCourse"),
            inverseJoinColumns=@JoinColumn(name="registrationNumber"))
    private Set<Student> students=new HashSet<Student>();

	
	protected Course()
	{
		
	}
	
	public Course(String name, int hoursWeek, Teacher assignedTeacher)
	{
		this.name=name;
		this.assignedTeacher=assignedTeacher;
		this.hoursWeek=hoursWeek;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHoursWeek() {
		return hoursWeek;
	}

	public void setHoursWeek(int hoursWeek) {
		this.hoursWeek = hoursWeek;
	}

	public Teacher getAssignedTeacher() {
		return assignedTeacher;
	}

	public void setAssignedTeacher(Teacher assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}
	
	public String toString()
	{
		return name + " [" + hoursWeek + "hs]" + " (" + students.size() + ")";
	}
	
	public void addStudent(Student student)
	{
		if(!students.contains(student))
		{
			students.add(student);
		}
	}
	
	public void removeStudent(Student student)
	{
		if (!students.contains(student))
		{
			students.remove(student);
		}
	}
	
	public Set<Student> getStudents()
	{
		return students;
	}
	
}
