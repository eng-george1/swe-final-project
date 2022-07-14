package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "courses")
public class Course {
    @Id
    int id;
    String name;
    //@OneToOne(mappedBy = "course")
//    @ManyToMany(mappedBy = "courses")
//      List<Student> students;
}
