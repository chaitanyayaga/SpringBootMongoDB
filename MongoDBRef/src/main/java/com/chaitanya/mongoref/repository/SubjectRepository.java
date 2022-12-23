package com.chaitanya.mongoref.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.chaitanya.mongoref.entity.Subject;



@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {

}
