package com.example.student_management_system.Repository;

import com.example.student_management_system.Model.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Berkay KADAMLI
 */

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    List<Student> findAllByOrderByIdAsc();
}
