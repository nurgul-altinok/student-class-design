package edu.student;

import java.time.LocalDate;

public final class Main {
    private Main() { }

    public static void main(String[] args) {
        Student student = new Student("S1001", "Ada Yılmaz", "ada@example.edu");
        Course course = new Course("CS101", "Introduction to Programming", 3);
        Enrollment enrollment = new Enrollment(student, course, LocalDate.now());
        System.out.println(enrollment);
    }
}
