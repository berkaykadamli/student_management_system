package com.example.student_management_system.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Berkay KADAMLI
 */
@Entity
public class Department {

    private int id;
    private String name;
    private int contact;
    private List<Teacher> teacherList;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column
    public String getName() {
        return name;
    }

    @Column
    public int getContact() {
        return contact;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }


}
