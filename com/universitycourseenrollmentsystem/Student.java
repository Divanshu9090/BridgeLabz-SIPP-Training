package com.universitycourseenrollmentsystem;

abstract class Student {
    private String studentId;
    private String name;
    private double gpa = 0.0;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public abstract void viewTranscript();
}
