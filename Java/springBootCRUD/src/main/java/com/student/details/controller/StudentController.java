package com.student.details.controller;

import com.student.details.service.StudentService;
import com.student.details.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @RequestMapping("/students/{roll}")
    public Student getStudent(@PathVariable int roll){
        return studentService.getStudent(roll);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/students")
    public void addStudent(@RequestBody Student student){
          studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/students/{roll}")
    public void updateStudent(@RequestBody Student student, @PathVariable int roll){
        studentService.updateStudent(student, roll);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/students/{roll}")
    public void deleteStudent(@PathVariable int roll){
        studentService.deleteStudent(roll);
    }
}
