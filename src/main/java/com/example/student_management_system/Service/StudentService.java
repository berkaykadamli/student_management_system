package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Student;

import java.util.List;
import java.util.Optional;
/**
 * Created by Berkay KADAMLI
 */
public interface StudentService {
    Student save(Student var1);

    Iterable<Student> saveAll(Iterable<Student> var1);

    Optional<Student> findById(int var1);

    boolean existsById(int var1);

    Iterable<Student> findAll();

    Iterable<Student> findAllById(Iterable<Student> var1);

    void deleteById(int var1);

    void delete(Student var1);

    void deleteAll();
    List<Student> findAllOrderByIdAsc();

}
