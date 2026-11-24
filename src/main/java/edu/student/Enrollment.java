package edu.student;

import java.time.LocalDate;
import java.util.Objects;

public final class Enrollment {
    private final Student student;
    private final Course course;
    private final LocalDate enrollmentDate;

    public Enrollment(Student student, Course course, LocalDate enrollmentDate) {
        this.student = Objects.requireNonNull(student, "student cannot be null");
        this.course = Objects.requireNonNull(course, "course cannot be null");
        this.enrollmentDate = Objects.requireNonNull(enrollmentDate, "enrollmentDate cannot be null");
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public LocalDate getEnrollmentDate() { return enrollmentDate; }

    @Override
    public String toString() {
        return student + " enrolled in " + course + " on " + enrollmentDate;
    }
}
