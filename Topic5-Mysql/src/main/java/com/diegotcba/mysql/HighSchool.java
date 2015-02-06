package com.diegotcba.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HighSchool {

	private DbConnection db;
	
	public HighSchool()
	{
		db=new DbConnection();
	}
	
	public String getCompleteCourse(int courseId)
	{
		String output="";
		String query="";
		String queryStudents="";
		
		query="SELECT Course.idCourse,Course.name,Teacher.lastName,Teacher.firstName FROM Course,Teacher ";
		query+="WHERE Course.assignedTeacher=Teacher.idTeacher AND Course.idCourse="+courseId;
		
		db.openConnection();
		ResultSet rs= db.getQuery(query);
		
		try{
			
			while (rs.next()) 
			{
				
				output="Course: " + rs.getString(2)+"\n";
				output+="Teacher: " + rs.getString(3) + ", " + rs.getString(4) + "\n";
				output+="Students:\n";
				
				queryStudents="SELECT Student.lastName, Student.firstName FROM StudentCourse,Student ";
				queryStudents+="WHERE StudentCourse.registrationNumber=Student.registrationNumber AND StudentCourse.idCourse="+ rs.getInt(1);
				queryStudents+=" ORDER BY Student.lastName ASC";
				
				ResultSet rsStudents=db.getQuery(queryStudents);
				
				while (rsStudents.next())
				{
					output+="   " + rsStudents.getString(1) + ", " + rsStudents.getString(2) + "\n";
				}
				
				rsStudents.close();
			}
			rs.close();
			
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			db.closeConnection();
		}
		return output;
	}
	
	public String getStudentFinalNotes(int registrationNumber)
	{
		String output="";
		String query="";
		String queryFinals="";
		
		query="SELECT registrationNumber,lastName,firstName FROM Student WHERE Student.registrationNumber=" + registrationNumber;
		
		db.openConnection();
		ResultSet rs=db.getQuery(query);	
		
		try {
			while(rs.next())
			{
				output="Student: " + rs.getString(2) + ", " + rs.getString(3) + "\n";
				output+="Final Notes: \n";
				
				queryFinals="SELECT Course.name,StudentCourse.year,StudentCourse.finalNote FROM StudentCourse,Course WHERE StudentCourse.idCourse=Course.idCourse";
				queryFinals+=" AND StudentCourse.registrationNumber=" + rs.getInt(1) + " ORDER BY 3 DESC";
				
				ResultSet rsFinals=db.getQuery(queryFinals);
				
				while(rsFinals.next())
				{
					output+="    " + rsFinals.getString(1) + " ("+ rsFinals.getInt(2) + ")" + "\t\t" + rsFinals.getInt(3) + "\n";
				}
				rsFinals.close();
			}
			rs.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			db.closeConnection();
		}

		return output;
		
	}
}
