package com.example.student_management_system.Model;

import javax.persistence.*;
/**
 * Created by Berkay KADAMLI
 */
@Entity
public class Student {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    //ilkokul,lise ,üni vb. (enum) yapılabilir.

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
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


    public void setId(int id) {
        this.id = id;
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
