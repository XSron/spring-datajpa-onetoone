package edu.mum.cs.cs425.onetoone;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.onetoone.model.Student;
import edu.mum.cs.cs425.onetoone.model.Transcript;
import edu.mum.cs.cs425.onetoone.service.IStudentService;

@SpringBootApplication
public class OnetooneApplication implements CommandLineRunner{
	@Autowired
	private IStudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Transcript transcript = new Transcript(3.8);
		Student student = new Student("Michael", LocalDate.now(), transcript);
		studentService.saveStudent(student);
	}
}
