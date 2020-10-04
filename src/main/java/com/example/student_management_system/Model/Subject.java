package com.example.student_management_system.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Berkay KADAMLI
 */
@Entity
@Table(name = "Subject")
//@EntityListeners(AuditingEntityListener.class)
public class Subject {

    private int id;
    private String subject_name;
    private int contact;
    private List<Student> studentList;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column(name = "subject_name")
    public String getName() {
        return subject_name;
    }

    @Column(name = "contact")
    public int getContact() {
        return contact;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String subject_name) {
        this.subject_name = subject_name;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
