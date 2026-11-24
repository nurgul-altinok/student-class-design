package edu.student;

import java.util.Objects;

public final class Student {
    private final String studentId;
    private String name;
    private String email;

    public Student(String studentId, String name, String email) {
        this.studentId = requireText(studentId, "studentId");
        this.name = requireText(name, "name");
        this.email = requireText(email, "email");
    }

    private static String requireText(String value, String field) {
        Objects.requireNonNull(value, field + " cannot be null");
        if (value.isBlank()) throw new IllegalArgumentException(field + " cannot be blank");
        return value.trim();
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = requireText(name, "name"); }
    public void setEmail(String email) { this.email = requireText(email, "email"); }

    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof Student student
                && studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() { return studentId.hashCode(); }

    @Override
    public String toString() { return name + " (" + studentId + ")"; }
}
