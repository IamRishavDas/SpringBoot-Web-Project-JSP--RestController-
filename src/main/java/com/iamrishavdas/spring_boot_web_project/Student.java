package com.iamrishavdas.spring_boot_web_project;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student{ id: " + this.id + ", name: " + this.name + " }";
    }
}
