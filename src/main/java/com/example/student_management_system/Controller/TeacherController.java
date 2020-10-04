package com.example.student_management_system.Controller;

import com.example.student_management_system.Exception.ResourceNotFoundException;
import com.example.student_management_system.Model.Teacher;
import com.example.student_management_system.Service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Berkay KADAMLI
 */

@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    private TeacherServiceImpl teacherService;

    @GetMapping("/get-all-teachers")
    public List<Teacher> getAllPeople() {
        return teacherService.findAll();
    }

    @PostMapping("/save-teacher")
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @GetMapping("/teacher/{id}")
    public Teacher findById(@PathVariable(value = "id") int id) {
        return teacherService.findById(id);
    }

    @PutMapping("/teacher/{id}")
    public void updateTeacher(@PathVariable(value = "id") int id, @RequestBody Teacher teacherDetails) {
        Teacher teacher = teacherService.findById(id);
        teacher.setFirst_name(teacherDetails.getFirst_name());
        teacher.setLast_name(teacherDetails.getLast_name());
        teacher.setEmail(teacherDetails.getEmail());
        teacher.setSubjectList(teacherDetails.getSubjectList());
//        teacher.setOffice(teacherDetails.getOffice());
        teacherService.save(teacher);
    }

    // Demirbaş tablosu database ile taahüt tarihleri bizim kütüphane gibi mantığında.

    @DeleteMapping("/teacher/{id}")
    public void delete(@PathVariable(value = "id") int id) {
        teacherService.deleteById(id);
    }
}
