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
            
            courseRepository.save(new Course("Calculus",5));
            courseRepository.save(new Course("Advanced Algebra", 3));
            courseRepository.save(new Course("English Literature", 4));
            
            Course courseOpen=courseRepository.findOne(1L);
            courseOpen.addStudent(studentRepository.findOne(1L));
            courseRepository.save(courseOpen);
            
            
		} catch (Exception e) {
			// TODO: handle exception
		}
        
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
        
        
        
    }
}
