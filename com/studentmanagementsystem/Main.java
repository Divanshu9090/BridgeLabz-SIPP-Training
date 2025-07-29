package com.studentmanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Set<String> subjects1 = new HashSet<>(Arrays.asList("Math", "Science"));
        Map<String, Double> grades1 = new HashMap<>();
        grades1.put("Math", 90.0);
        grades1.put("Science", 85.0);

        Set<String> subjects2 = new HashSet<>(Arrays.asList("English", "Math"));
        Map<String, Double> grades2 = new HashMap<>();
        grades2.put("English", 88.0);
        grades2.put("Math", 75.0);

        manager.addStudent(new Student("S101", "Anubhav", 20, subjects1, grades1));
        manager.addStudent(new Student("S102", "Prakash", 21, subjects2, grades2));

        System.out.println("All Students");
        manager.printAllStudents();

        System.out.println(manager.searchById("S101"));

        for (Student s : manager.searchByName("Prakash")) {
            System.out.println(s);
        }

        for (Student s : manager.sortByName()) {
            System.out.println(s);
        }

        for (Student s : manager.sortByAverageGrade()) {
            System.out.println(s);
        }

        for (Student s : manager.findBySubject("Math")) {
            System.out.println(s);
        }
    }
}

