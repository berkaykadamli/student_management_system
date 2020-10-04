package com.example.student_management_system.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Berkay KADAMLI
 */
@Entity
@Table
public class Teacher {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private List<Subject> subjectList;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getFirst_name() {
        return first_name;
    }

    @Column
    public String getLast_name() {
        return last_name;
    }


    @Column
    public String getEmail() {
        return email;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
