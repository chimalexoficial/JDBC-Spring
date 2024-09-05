package com.example.SpringJDBCEx.repo;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(Student s) {
        System.out.println("Saved!");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
