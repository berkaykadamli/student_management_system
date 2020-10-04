package com.example.student_management_system.Controller;

import com.example.student_management_system.Exception.ResourceNotFoundException;
import com.example.student_management_system.Model.Department;
import com.example.student_management_system.Service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

/**
 * Created by Berkay KADAMLI
 */
@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping("/get-all-departments")
    public List<Department> getAllDepartment() {
        return departmentService.findAll();
    }

    @PostMapping("/save-department")
    public Department insertDepartment(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<Department> findById(@PathVariable(value = "id") int id) throws ResourceNotFoundException {
        Department department = departmentService.findById(id).orElseThrow(() -> new ResourceAccessException("Department not found for this id ::" + id));
        return ResponseEntity.ok().body(department);
    }

    @PutMapping("/department/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable(value = "id") int id, Department departmentDetails) throws ResourceNotFoundException {
        Department department = departmentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department not found for this id ::" + id));
        department.setContact(departmentDetails.getContact());
        department.setName(departmentDetails.getName());

        return ResponseEntity.ok(department);
    }

    @DeleteMapping("/department/{id}")
    public void delete(@PathVariable(value = "id") int id) throws ResourceNotFoundException {
        Department department = departmentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department not found for this id ::" + id));
        departmentService.delete(department);
    }


}
