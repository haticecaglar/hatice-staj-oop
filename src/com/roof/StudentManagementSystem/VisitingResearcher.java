package com.roof.StudentManagementSystem;

import javax.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor{
    private int HourlySalary;

    public VisitingResearcher(String name, String address, String PhoneNumber, int HourlySalary) {
        super(name, address, PhoneNumber);
        this.HourlySalary=HourlySalary;
    }

    public VisitingResearcher(int HourlySalary){
        this.HourlySalary=HourlySalary;
    }

    public VisitingResearcher(){

    }

    public int getHourlySalary() {
        return HourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        HourlySalary = hourlySalary;
    }
}
