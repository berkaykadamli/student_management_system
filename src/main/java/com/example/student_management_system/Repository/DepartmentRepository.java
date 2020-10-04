package com.example.student_management_system.Repository;

import com.example.student_management_system.Model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by Berkay KADAMLI
 */
@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {
}
