package com.example.demo.service;

import com.example.demo.domain.Course;
import com.example.demo.domain.Student;
import com.example.demo.repo.CourseRepo;
import com.example.demo.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
      CourseRepo courseRepo;

    public List<Course> findAll(){

        return courseRepo.findAll();
    }
}
