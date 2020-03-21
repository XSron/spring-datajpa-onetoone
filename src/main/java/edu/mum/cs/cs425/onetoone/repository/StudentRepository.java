package edu.mum.cs.cs425.onetoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.onetoone.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
