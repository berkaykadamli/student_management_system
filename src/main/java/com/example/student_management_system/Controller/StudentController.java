package com.example.student_management_system.Controller;

import com.example.student_management_system.Model.Student;
import com.example.student_management_system.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Berkay KADAMLI
 */

@RestController
@RequestMapping("/api")//link --> localhost:8080/api/students
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/get-all-students")
    public List<Student> getAllPeople() {
        return studentService.findAll();
    }

    @GetMapping("/get-all-students-asc")
    public List<Student> getAllPeopleOrderByIdAsc() {
        return studentService.findAllOrderByIdAsc();
    }


    @PostMapping("/save-student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") int id) throws ResourceNotFoundException {
        Student student = studentService.findById(id).orElseThrow(() -> new ResourceNotFoundException(("Student not found for this id ::" + id)));
        return ResponseEntity.ok().body(student);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") int id, @RequestBody Student studentDetails) throws ResourceNotFoundException {
        Student student = studentService.findById(id).orElseThrow(() -> new ResourceNotFoundException(("Student not found for this id ::" + id)));
        student.setFirst_name(studentDetails.getFirst_name());
        student.setLast_name(studentDetails.getLast_name());
        student.setEmail(studentDetails.getEmail());
        return ResponseEntity.ok(this.studentService.save(student));
    }

//    @DeleteMapping("/student/{id}")
//    public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") int id) throws ResourceNotFoundException {
//        Student student = studentService.findById(id).orElseThrow(() -> new ResourceNotFoundException(("Student not found for this id ::" + id)));
//        this.studentService.delete(student);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable(value = "id")int id){
       studentService.deleteById(id);
    }

}
