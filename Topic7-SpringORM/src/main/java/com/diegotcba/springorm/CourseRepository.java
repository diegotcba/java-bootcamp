package com.diegotcba.springorm;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
//	Course findByName(String name);
//	List<Course> findByTeacher(Teacher assignedTeacher);
}
