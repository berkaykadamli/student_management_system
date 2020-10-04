package com.example.student_management_system.Repository;

import com.example.student_management_system.Model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by Berkay KADAMLI
 */
@Repository
public interface SubjectRepository extends CrudRepository<Subject,Integer> {
}
