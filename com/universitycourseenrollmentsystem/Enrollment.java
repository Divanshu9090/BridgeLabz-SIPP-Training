package com.universitycourseenrollmentsystem;

class Enrollment {
   private Student student;
   private Course course;
   private double grade = -1;

   public Enrollment(Student student, Course course) {
      this.student = student;
      this.course = course;
   }

   public Student getStudent() {
      return student;
   }

   public Course getCourse() {
      return course;
   }

   public double getGrade() {
      return grade;
   }

   public void setGrade(double grade) {
      this.grade = grade;
   }
}
