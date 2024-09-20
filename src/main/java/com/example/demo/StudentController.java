package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")

public class StudentController {

    private Student student = new Student("Renee Razcae P. Bergoro", 22);

    @GetMapping
    public Student getStudent() {
        return student;
    }
}


