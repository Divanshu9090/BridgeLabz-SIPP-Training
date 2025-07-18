package com.OOPD.associationandaggregation;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}