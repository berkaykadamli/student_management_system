package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Subject;
import com.example.student_management_system.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
/**
 * Created by Berkay KADAMLI
 */
@Service
@Transactional
public class SubjectServiceImpl {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findAll(){
        return (List<Subject>) subjectRepository.findAll();
    }

    public Subject save(Subject subject){
        return subjectRepository.save(subject);
    }

    public Optional<Subject> findById(int id){
        return subjectRepository.findById(id);
    }

    public void delete(Subject subject){
        subjectRepository.delete(subject);
    }

}
