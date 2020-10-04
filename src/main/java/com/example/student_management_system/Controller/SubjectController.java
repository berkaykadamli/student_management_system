package com.example.student_management_system.Controller;

import com.example.student_management_system.Model.Subject;
import com.example.student_management_system.Service.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Created by Berkay KADAMLI
 */
@RestController
@RequestMapping("/api")
public class SubjectController {
    @Autowired
    private SubjectServiceImpl subjectService;

    @GetMapping("/get-all-subjects")
    public List<Subject> getAllSubject(){
        return subjectService.findAll();
    }

    @PostMapping("/save-subject")
    public Subject insertSubject(@RequestBody Subject subject){
        return subjectService.save(subject);
    }

    @GetMapping("/subject/{id}")
    public ResponseEntity<Subject> findById(@PathVariable(value = "id")int id) throws ResourceNotFoundException{
        Subject subject=subjectService.findById(id).orElseThrow(()->new ResourceNotFoundException("Subject not found for this id ::"+id));
        return ResponseEntity.ok().body(subject);
    }

    @PutMapping("/subject/{id}")
    public ResponseEntity<Subject> updateSubject(@PathVariable(value = "id")int id,@RequestBody Subject subjectDetails){
        Subject subject =subjectService.findById(id).orElseThrow(()->new ResourceNotFoundException("Subject not found for this id ::"+id));
        subject.setContact(subjectDetails.getContact());
        subject.setName(subjectDetails.getName());
        return ResponseEntity.ok(subject);
    }

    @DeleteMapping("/subject/{id}")
    public void delete(@PathVariable(value = "id")int id ){
        Subject subject=subjectService.findById(id).orElseThrow(()->new ResourceNotFoundException("Subject not found for this id ::"+id));
        subjectService.delete(subject);
    }
}
