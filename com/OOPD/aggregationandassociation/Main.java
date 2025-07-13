package com.OOPD.aggregationandassociation;

public class Main {
    public static void main(String[] args) {
        // Create University
        University stateU = new University("State University");

        // Create Students and Professors
        Student alice = new Student("Alice");
        Professor drSmith = new Professor("Dr. Smith");

        // Create Course
        Course cs101 = new Course("CS101");

        // Add to University (Aggregation)
        stateU.addStudent(alice);
        stateU.addProfessor(drSmith);

        // Enroll Student and Assign Professor (Association)
        alice.enrollCourse(cs101);
        drSmith.assignCourse(cs101);

        // Demonstrate functionality
        stateU.listStudents();
        stateU.listProfessors();
        alice.viewCourses();
        drSmith.viewCourses();
        cs101.listStudents();
        cs101.listProfessors();
    }
}