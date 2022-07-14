package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    int id;
    String name;
//    @OneToMany
//  //  @JoinTable(name = "Yaheya")
//    List<Course> courses;
    @ManyToOne
   // @JoinTable(name="Yahya")
    Course course;
}
