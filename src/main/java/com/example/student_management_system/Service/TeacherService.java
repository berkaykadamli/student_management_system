package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Teacher;
import java.util.Optional;
/**
 * Created by Berkay KADAMLI
 */
public interface TeacherService {
    Teacher save(Teacher var1);

    Iterable<Teacher> saveAll(Iterable<Teacher> var1);

    Optional<Teacher> findById(int var1);

    boolean existsById(int var1);

    Iterable<Teacher> findAll();

    Iterable<Teacher> findAllById(Iterable<Teacher> var1);

    void deleteById(int var1);

    void delete(Teacher var1);

    void deleteAll();
}
