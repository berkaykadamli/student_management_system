package com.example.student_management_system.Repository;

import com.example.student_management_system.Model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by Berkay KADAMLI
 */
@Repository
public interface TeacherRepository extends CrudRepository<Teacher,Integer> {
    Teacher findById(int id);
}
