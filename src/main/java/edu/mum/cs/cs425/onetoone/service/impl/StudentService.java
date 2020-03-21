package edu.mum.cs.cs425.onetoone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.onetoone.model.Student;
import edu.mum.cs.cs425.onetoone.repository.StudentRepository;
import edu.mum.cs.cs425.onetoone.service.IStudentService;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void saveStudent(Student student) {
		if(student != null)
			studentRepository.save(student);
	}
}
