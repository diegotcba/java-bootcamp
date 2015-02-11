package com.diegotcba.springorm;

import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Topic7 - Spring ORM \n\n" );
        
        ConfigurableApplicationContext context=SpringApplication.run(App.class);
        
        TeacherRepository teacherRepository=context.getBean(TeacherRepository.class);
        
        CourseRepository courseRepository=context.getBean(CourseRepository.class);
        
        StudentRepository studentRepository=context.getBean(StudentRepository.class);
        
        try {
            studentRepository.save(new Student("Beverly", "Huffman", new SimpleDateFormat("yyyy-MM-dd").parse("1990-03-02")));
            studentRepository.save(new Student("Nathaniel", "Sandoval", new SimpleDateFormat("yyyy-MM-dd").parse("1983-05-28")));
            studentRepository.save(new Student("Dominique", "Mays", new SimpleDateFormat("yyyy-MM-dd").parse("1981-10-31")));

            teacherRepository.save(new Teacher("Yoshi","Vance",new SimpleDateFormat("yyyy-MM-dd").parse("1988-04-03")));
            teacherRepository.save(new Teacher("Maryam","Adams",new SimpleDateFormat("yyyy-MM-dd").parse("1980-10-01")));
            teacherRepository.save(new Teacher("Bruce","Nielsen",new SimpleDateFormat("yyyy-MM-dd").parse("1973-06-29")));
            teacherRepository.save(new Teacher("Tucker","Chang",new SimpleDateFormat("yyyy-MM-dd").parse("1988-04-03")));
            teacherRepository.save(new Teacher("Blythe","Salinas",new SimpleDateFormat("yyyy-MM-dd").parse("1975-05-09")));
            
            courseRepository.save(new Course("Calculus",5, teacherRepository.findOne(1L)));
            courseRepository.save(new Course("Advanced Algebra", 3, teacherRepository.findOne(3L)));
            courseRepository.save(new Course("English Literature", 4, teacherRepository.findOne(3L)));
            
            Course courseOpen=courseRepository.findOne(1L);
            courseOpen.addStudent(studentRepository.findOne(1L));
            courseOpen.addStudent(studentRepository.findOne(3L));
            courseRepository.save(courseOpen);
            
            Course courseOpen2=courseRepository.findOne(2L);
            courseOpen2.addStudent(studentRepository.findOne(1L));
            courseOpen2.addStudent(studentRepository.findOne(2L));
            courseRepository.save(courseOpen2);
            
            Course courseOpen3=courseRepository.findOne(3L);
            courseOpen3.addStudent(studentRepository.findOne(1L));
            courseOpen3.addStudent(studentRepository.findOne(2L));
            courseOpen3.addStudent(studentRepository.findOne(3L));
            courseRepository.save(courseOpen3);            
            
            System.out.println("-----------Listing all Students---------------\n");
            for (Student student : studentRepository.findAll()) {
    			System.out.println(student.toString()+"\n");
    		}
            
            
            Iterable<Teacher> teachers=teacherRepository.findAll();
            System.out.println("-----------Listing all Teachers---------------\n");
            for (Teacher teacher : teachers) {
    			System.out.println(teacher.toString()+"\n");
    		}
            
            
            Iterable<Course> courses=courseRepository.findAll();
            System.out.println("-----------Listing all Courses---------------\n");
            for (Course course : courses) {
    			System.out.println(course.toString()+"\n");
    		}
            
            
            Course courseDetails=courseRepository.findOne(1L);
            System.out.println("\n\n------------ Course's Students -------------");
            System.out.println(courseDetails);
            System.out.println("------------------------------------------------");
            for (Student student : courseDetails.getStudents()) {
    			System.out.println(student.toString()+"\n");
    		}
            System.out.println("------------------------------------------------\n\n");
            
            
            Student studentDetails=studentRepository.findOne(1L);
            System.out.println("---------- Student's Courses ---------------");
            System.out.println(studentDetails);
            System.out.println("--------------------------------------------");
            for (Course course : studentDetails.getCourses()) {
    			System.out.println(course.toString()+"\n");
    		}
            System.out.println("--------------------------------------------");
            
            Teacher teacherDetails=teacherRepository.findOne(3L);
            System.out.println("\n\n---------- Teacher's Courses ---------------");
            System.out.println(teacherDetails);
            System.out.println("--------------------------------------------");
            for (Course course : teacherDetails.getCourses()) {
    			System.out.println(course.toString()+"\n");
    		}
            System.out.println("--------------------------------------------");
            
            
            
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
