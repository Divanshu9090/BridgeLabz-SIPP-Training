package com.studentmanagementsystem;

import java.util.*;

class Student {
    private String id;
    private String name;
    private int age;
    private Set<String> subjects;
    private Map<String, Double> grades;

    public Student(String id, String name, int age, Set<String> subjects, Map<String, Double> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = new HashSet<>(subjects);
        this.grades = new HashMap<>(grades);
    }

    public String getId() { 
    	return id; 
    }
    
    public String getName() { 
    	return name; 
    }
    
    public int getAge() { 
    	return age; 
    }
    
    public Set<String> getSubjects() { 
    	return subjects; 
    }
    
    public Map<String, Double> getGrades() { 
    	return grades; 
    }

    public double getAverageGrade() {
        return grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age +
               ", Subjects: " + subjects + ", Grades: " + grades;
    }
}
