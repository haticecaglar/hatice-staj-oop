package com.roof.StudentManagementSystem;

import javax.persistence.Entity;

@Entity
public class PermanentInstructor extends Instructor{

    private int FixedSalary;

    public PermanentInstructor(String name, String address, String PhoneNumber , int FixedSalary) {
        super(name, address, PhoneNumber);
        this.FixedSalary=FixedSalary;
    }
    public PermanentInstructor(int FixedSalary){
        this.FixedSalary=FixedSalary;
    }

    public PermanentInstructor(){

    }

    public int getFixedSalary() {
        return FixedSalary;
    }


    public void setFixedSalary(int fixedSalary) {
        FixedSalary = fixedSalary;
    }
}
