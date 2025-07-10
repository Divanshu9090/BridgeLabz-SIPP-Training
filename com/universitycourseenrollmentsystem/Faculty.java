package com.universitycourseenrollmentsystem;

class Faculty implements Graded {
    private String facultyId;
    private String name;

    public Faculty(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    @Override
    public void assignGrade(Enrollment enrollment, double score) {
        System.out.println("Faculty " + name + " assigning grade...");
        enrollment.setGrade(score);
    }
}