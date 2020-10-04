package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Student;
import com.example.student_management_system.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


/**
 * Created by Berkay KADAMLI
 */
@Service
@Transactional//for rest ve db
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    public List<Student> findAllOrderByIdAsc() {
        return (List<Student>) studentRepository.findAllByOrderByIdAsc();
//        return studentList.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
    }
}
