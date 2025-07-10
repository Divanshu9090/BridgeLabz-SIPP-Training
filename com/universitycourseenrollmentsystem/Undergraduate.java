package com.universitycourseenrollmentsystem;

class Undergraduate extends Student {
    public Undergraduate(String studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void viewTranscript() {
        System.out.println("Undergraduate Transcript for " + getName() + " (ID: " + getStudentId() + ")");
        System.out.println("GPA: " + getGPA());
    }
}