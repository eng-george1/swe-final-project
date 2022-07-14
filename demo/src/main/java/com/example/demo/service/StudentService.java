package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
      StudentRepo studentRepo;

    public List<Student> findAll(){

        return studentRepo.findAll();
    }
}
