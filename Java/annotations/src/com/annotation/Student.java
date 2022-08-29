package com.annotation;

//TODO: Custom Annotation
@MyAnnotation(myValue = 24, name = "Yousuf",city = "Rajshahi")
public class Student {
    private int number1, number2;

    public Student(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    //TODO: Override annotation
    @Override
    public String toString(){
        return getClass().getSimpleName();
    }

    //TODO: Deprecated Annotation
    @Deprecated
    public int calculateMarks(){
        return number1+number1;
    }
}
