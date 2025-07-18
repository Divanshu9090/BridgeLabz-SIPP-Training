package com.OOPD.associationandaggregation;

public class Main {
    public static void main(String[] args) {
        // Create School
        School highSchool = new School("High School");

        // Create Students
        Student Divanshu = new Student("Divanshu");
        Student Anubhav = new Student("Anubhav");

        // Create Course
        Course math = new Course("Math");
        Course science = new Course("Science");

        // Add Students to School (Aggregation)
        highSchool.addStudent(Divanshu);
        highSchool.addStudent(Anubhav);

        // Enroll Students in Courses (Association)
        Divanshu.enrollCourse(math);
        Divanshu.enrollCourse(science);
        Anubhav.enrollCourse(math);

        // Demonstrate functionality
        highSchool.listStudents();
        Divanshu.viewCourses();
        math.listStudents();
        science.listStudents();
    }
}
