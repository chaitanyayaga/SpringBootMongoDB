package com.chaitanya.mongoref.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.chaitanya.mongoref.entity.Student;



@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findByName(String name);
	
	Student findByEmailAndName (String email, String name);
	
	Student findByNameOrEmail (String name, String email);
	
	List<Student> findByEmailIsLike (String email);
	
	List<Student> findByNameStartsWith (String name);
	
	List<Student> findByDepartmentId (String deptId);
	
	@Query("{ \"name\" : \"?0\" }")
	List<Student> getByname(String name);
}
