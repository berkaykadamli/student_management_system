package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Subject;
import java.util.Optional;
/**
 * Created by Berkay KADAMLI
 */

public interface SubjectService {
    Subject save(Subject var1);

    Iterable<Subject> saveAll(Iterable<Subject> var1);

    Optional<Subject> findById(int var1);

    boolean existsById(int var1);

    Iterable<Subject> findAll();

    Iterable<Subject> findAllById(Iterable<Subject> var1);

    void deleteById(int var1);

    void delete(Subject var1);

    void deleteAll();
}
