package com.OOPD.associationandaggregation;

import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}