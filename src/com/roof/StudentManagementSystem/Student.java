package com.roof.StudentManagementSystem;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Student {
    @Id
    private int id;
    private String name;
    private String BirthDate;
    private String address;
    private String gender;

    @ManyToMany
    private List<Course> courseList = new ArrayList<>();

    public Student(String name, String BirthDate, String address, String gender) {
        this.name = name;
        this.BirthDate = BirthDate;
        this.address = address;
        this.gender = gender;
    }

    public Student() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", vehicleList=" + courseList +
                '}';
    }
}
