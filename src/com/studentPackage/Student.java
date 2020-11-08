package com.studentPackage;

import java.util.Calendar;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String fatherName;
    private Calendar dateOfBirth;
    private String adress;
    private int phone;
    private String faculty;
    private int course;
    private String group;

    public Student() {}
    public Student(int id, String surname, String name, String fatherName, Calendar dateOfBirth, String adress,
                   int phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Id: "+id+", Name: "+name+", Surname: "+surname+", Father name: "+fatherName+
                ", Date of birth: "+dateOfBirth.get(Calendar.YEAR)+"-"+dateOfBirth.get(Calendar.MONTH)+"-"+
                dateOfBirth.get(Calendar.DATE)
                +", Adress: "+adress+", Phone: "+phone+", Faculty: "+faculty+", Course: "+course+ ", Group: "+group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }
}

