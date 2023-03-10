package miu.edu.com.courseregistrationsystem.controller;

import miu.edu.com.courseregistrationsystem.domain.RegistrationEvent;
import miu.edu.com.courseregistrationsystem.domain.Student;
import miu.edu.com.courseregistrationsystem.service.StudentService;
import miu.edu.com.courseregistrationsystem.service.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @GetMapping("/all")
    public ResponseEntity<?> getAllStudent(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping(value = "/get/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }
}
