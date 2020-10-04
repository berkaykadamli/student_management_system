package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Department;
import java.util.Optional;
/**
 * Created by Berkay KADAMLI
 */
public interface DepartmentService {
    Department save(Department var1);

    Iterable<Department> saveAll(Iterable<Department> var1);

    Optional<Department> findById(int var1);

    boolean existsById(int var1);

    Iterable<Department> findAll();

    Iterable<Department> findAllById(Iterable<Department> var1);

    void deleteById(int var1);

    void delete(Department var1);

    void deleteAll();

}
