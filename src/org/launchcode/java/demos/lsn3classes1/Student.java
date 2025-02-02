package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String firstName;
    private String lastName;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String firstName, String lastName, int studentId, int numberOfCredits, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student (String firstName, String lastName, int studentId) {
        this(firstName, lastName, studentId, 0, 0.0f);
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    private void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGradeLevel() {
        if (this.getNumberOfCredits() > 0 && this.getNumberOfCredits() <= 29) {
            return "Freshman";
        } else if (this.getNumberOfCredits() <= 59) {
            return "Sophomore";
        } else if (this.getNumberOfCredits() <= 89) {
            return "Junior";
        } else if (this.getNumberOfCredits() > 90) {
            return "Senior";
        }

        return "Something is wrong with this student.";
    }

    public void addGrade(int numOfCredits, double grade) {

        final double currentGPA = this.getGpa() / this.getNumberOfCredits();

        final double addedGPA = grade / numOfCredits;

        this.setNumberOfCredits(numOfCredits + this.getNumberOfCredits());

    }
}