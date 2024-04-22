package com.App.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
