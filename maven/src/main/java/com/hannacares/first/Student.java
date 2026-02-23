package com.hannacares.first;

public class Student {

    private String name;
    private String course;
    private int age;

    public Student() {}
    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public void Intro() {
        System.out.println("=== Student Program ===");
    }

    public String toString() {
        return name + " " + course + " " + age;
    }
}