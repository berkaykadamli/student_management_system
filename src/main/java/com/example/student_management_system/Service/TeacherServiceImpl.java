package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Teacher;
import com.example.student_management_system.Repository.TeacherRepository;
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
public class TeacherServiceImpl {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> findAll() {//show all of the teacher
        return (List<Teacher>) teacherRepository.findAll();
    }

    public Teacher findById(int id) {
        return teacherRepository.findById(id);
    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void delete(Teacher teacher) {
        teacherRepository.delete(teacher);
    }


    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }
}
