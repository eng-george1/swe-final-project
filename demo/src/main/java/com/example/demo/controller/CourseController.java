package com.example.demo.controller;

import com.example.demo.domain.Course;
import com.example.demo.domain.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/courses")
@AllArgsConstructor
public class CourseController {
   final CourseService courseService;

    @GetMapping
    public List<Course> findAll() {
        return courseService.findAll();
    }
}
