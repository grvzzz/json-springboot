package com.opus.demo.emprepo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.opus.demo.model.Employee;



@Repository
public interface EmpRepo extends MongoRepository<Employee, String> {

	
}
