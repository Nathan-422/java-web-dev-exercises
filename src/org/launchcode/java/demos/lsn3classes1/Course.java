package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String name;
    private String section;
    private ArrayList<Teacher> instructors;
    private ArrayList<Student> students;

    public Course(String name, String section, Teacher instructor) {
        this.name = name;
        this.section = section;
        this.instructors = new ArrayList<>();
        this.students = new ArrayList<>();

        this.instructors.add(instructor);
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public ArrayList<Teacher> getInstructors() {
        return new ArrayList<>(instructors);
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<Student>(students);
    }
}
