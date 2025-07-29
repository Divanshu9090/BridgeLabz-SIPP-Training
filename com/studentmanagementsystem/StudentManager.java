package com.studentmanagementsystem;

import java.util.*;

class StudentManager {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(String id) {
    	if(!students.containsKey(id)) {
    		System.out.println("No such id exist");
    		return;
    	}
    	System.out.println(students.get(id).toString());
        students.remove(id);
        System.out.println("removed successfully");
    }

    public Student searchById(String id) {
	    if (students.containsKey(id)) {
	        return students.get(id);
	    } else {
	        System.err.println("No such ID exists");
	        return null;
	    }
    }

    public List<Student> searchByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : students.values()) {
            if (s.getName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Student> sortByName() {
        List<Student> list = new ArrayList<>(students.values());
        list.sort(Comparator.comparing(Student::getName));
        return list;
    }

    public List<Student> sortByAverageGrade() {
        List<Student> list = new ArrayList<>(students.values());
        list.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
        return list;
    }

    public List<Student> findBySubject(String subject) {
        List<Student> result = new ArrayList<>();
        for (Student s : students.values()) {
            if (s.getSubjects().contains(subject)) {
                result.add(s);
            }
        }
        return result;
    }

    public void printAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}
