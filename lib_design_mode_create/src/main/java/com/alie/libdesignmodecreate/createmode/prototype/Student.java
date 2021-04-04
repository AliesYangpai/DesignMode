package com.alie.libdesignmodecreate.createmode.prototype;

import java.util.List;

public class Student implements Cloneable{
    private String name;
    private short age;
    private String gender;
    private List<String> stringList;


    public Student(String name, short age, String gender, List<String> stringList) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stringList = stringList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Student(String name, short age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
