package com.diegotcba.mysql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HighSchool hs=new HighSchool();
    	
        System.out.println( "MySQL Practice\n\n" );
        
        System.out.println(hs.getCompleteCourse(1));
        
        System.out.println("\n\n");
        
        System.out.println(hs.getStudentFinalNotes(6));
    }
}
