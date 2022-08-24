package com.maven.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAppTest {
    private MyApp app;

    @BeforeEach
    void setUp() {
        app = new MyApp("Rumman",30);
    }

    @Test
    void getAge() {
        assertEquals(30,app.getAge());
    }
}