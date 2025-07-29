package com.studentmarksreportwithmapandlist;

public class Main {
    public static void main(String[] args) {
        Student newReport= new Student();

        newReport.addMarks("Prakash", 85);
        newReport.addMarks("Prakash", 90);

        newReport.addMarks("Divanshu",95);
        newReport.addMarks("Divanshu", 85);
        System.out.println("Top performing student:"+ newReport.topPerformingStudent());
    }
}