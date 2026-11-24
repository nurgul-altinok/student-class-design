package edu.student;

import java.util.Objects;

public final class Course {
    private final String courseCode;
    private String title;
    private int credits;

    public Course(String courseCode, String title, int credits) {
        this.courseCode = requireText(courseCode, "courseCode");
        this.title = requireText(title, "title");
        setCredits(credits);
    }

    private static String requireText(String value, String field) {
        Objects.requireNonNull(value, field + " cannot be null");
        if (value.isBlank()) throw new IllegalArgumentException(field + " cannot be blank");
        return value.trim();
    }

    public String getCourseCode() { return courseCode; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }

    public void setTitle(String title) { this.title = requireText(title, "title"); }

    public void setCredits(int credits) {
        if (credits <= 0) throw new IllegalArgumentException("credits must be positive");
        this.credits = credits;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof Course course
                && courseCode.equals(course.courseCode);
    }

    @Override
    public int hashCode() { return courseCode.hashCode(); }

    @Override
    public String toString() { return courseCode + " - " + title; }
}
