package com.App.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.App.Service.StudentService;
import com.App.dto.Student;

@RestController
@RequestMapping("/students/")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("studentlist")
	public List<Student> getAllStudents() {
		return studentService.getAllStudent();
	}

	@GetMapping("edit/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("saveStudent")
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@PutMapping("edit/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		student.setId(id);
		return studentService.saveStudent(student);
	}

	@DeleteMapping("delete/{id}")
	public String delteStudent(@PathVariable(value = "id") int id) {
		studentService.deleteById(id);
		return "deleted succesfully";
	}
}