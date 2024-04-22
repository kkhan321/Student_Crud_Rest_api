package com.App.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.Repositoy.StudentRepository;
import com.App.dto.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {	
		return studentRepository.save(student);
	}
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public void deleteById(int id) {
     studentRepository.deleteById(id);
         
	}

}
