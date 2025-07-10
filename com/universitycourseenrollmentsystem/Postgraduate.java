package com.universitycourseenrollmentsystem;

class Postgraduate extends Student {
    public Postgraduate(String studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void viewTranscript() {
        System.out.println("Postgraduate Transcript for " + getName() + " (ID: " + getStudentId() + ")");
        System.out.println("GPA: " + getGPA());
    }
}
