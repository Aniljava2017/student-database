package com.example.studentdatabase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name = "STUDENT_TABLE")

public class Student {
    @Id
    @GeneratedValue
    @Column(name = "STD_ID")
    Long id;
    @Column(name = "STD_NAME")
    String name;
    @Column(name = "STD_SEC")
    String section;
    @Column(name = "STD_COUR")
    String course;
    // Use constructor
    public  Student (){

    }
    public Student(Long id, String name, String section, String course) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.course = course;
    }
    // Use Setter and Getter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
