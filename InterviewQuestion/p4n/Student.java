package p4n;

import java.util.ArrayList;
import java.util.List;

public class Student {
 
    private int studentId;
    private String studentName;
    private List<Double> grades;

   
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

  
    public int getStudentId() {
        return studentId;
    }

  
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    
    public String getStudentName() {
        return studentName;
    }

   
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully for " + studentName);
        } else {
            System.out.println("Invalid grade! Grade must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        
        Student student = new Student(101, "John Doe");

        // Accessing and modifying instance variables using getter and setter methods
        System.out.println("Initial Student ID: " + student.getStudentId());
        System.out.println("Initial Student Name: " + student.getStudentName());

        student.setStudentId(102);
        student.setStudentName("Jane Smith");

        System.out.println("\nUpdated Student ID: " + student.getStudentId());
        System.out.println("Updated Student Name: " + student.getStudentName());

        // Adding grades
        student.addGrade(90.5);
        student.addGrade(75.0);
        student.addGrade(105.0); // Invalid grade
    }
}
