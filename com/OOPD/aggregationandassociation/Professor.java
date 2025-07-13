package com.OOPD.aggregationandassociation;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.addProfessor(this);
    }

    public void viewCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}