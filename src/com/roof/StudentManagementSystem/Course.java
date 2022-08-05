package com.roof.StudentManagementSystem;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Course {
    @Id
    private int id;
    private String CourseName;
    private String CourseCode;
    private int CreditScore;
    @ManyToOne
    private Instructor instructor;

    public Course(String CourseName, String CourseCode, int CreditScore) {
       this.CourseName=CourseName;
       this.CourseCode=CourseCode;
       this.CreditScore=CreditScore;

    }

    public Course(){

    }


    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public int getCreditScore() {
        return CreditScore;
    }

    public void setCreditScore(int creditScore) {
        CreditScore = creditScore;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                ", CourseCode='" + CourseCode + '\'' +
                ", CreditScore=" + CreditScore +
                ", instructor=" + instructor +
                '}';
    }
}
