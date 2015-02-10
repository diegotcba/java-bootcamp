package com.diegotcba.springorm;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByLastName(String lastName);
}
