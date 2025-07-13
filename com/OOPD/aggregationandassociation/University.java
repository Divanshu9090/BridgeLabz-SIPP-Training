package com.OOPD.aggregationandassociation;

import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Student> students;
    private List<Professor> professors;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void listStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public void listProfessors() {
        System.out.println("Professors in " + name + ":");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }
}