package com.diegotcba.springorm;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
	Optional<Course> findByName(String name);
}
