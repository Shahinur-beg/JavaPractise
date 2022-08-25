package com.gradle;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    public Student student;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        student = new Student("Rumman",102,25);
    }

    @org.junit.jupiter.api.Test
    public void getAge() {
        assertEquals(25,student.getAge());
    }
}