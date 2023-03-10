package com.chaitanya.mongoref.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.chaitanya.mongoref.entity.Department;



@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
