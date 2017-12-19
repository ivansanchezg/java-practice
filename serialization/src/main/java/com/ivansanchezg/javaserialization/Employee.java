package com.ivansanchezg.javaserialization;

import java.io.Serializable;

//Class must implement interface Serializable
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L; //serialVersionUID ensures that the same class is being used when deserializing
    //The access modifier of the variables is not used when serializing and deserializing.
    private String name;
    private int salary;
    private int departmentId;
    private transient String address; //Transient variables are not serialized

    public Employee(String name, int salary, int departmentId, String address) {
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
        this.address = address;
    }

    public String toString() {
        String address;
        if(this.address == null) {
            address = "No address recorded";
        } else {
            address = this.address;
        }
        return "Name: " + name + ", Salary: " + salary + ", DepartmentId: " + departmentId + ", Address: " + address;
    }
}