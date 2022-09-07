package com.student.details.service;

import com.student.details.entity.Student;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.*;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(101,"Shahin","ICE","2016-2017"),
            new Student(102,"Rumman","CSE","2015-2016")
    ));
    public List<Student> getAllStudents(){
        return students;
    }
    public Student getStudent(int  roll){
        for(var student: students){
            if(student.getRoll()==roll){
                return student;
            }
        }
        return null;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void updateStudent(Student student, int roll) {
        for(int i = 0; i< students.size(); i++){
            Student t = students.get(i);
            if(t.getRoll()==roll){
                students.set(i, student);
                return;
            }
        }
    }
    public void deleteStudent(int roll) {
        try{
            students.removeIf(student -> student.getRoll()==roll);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
