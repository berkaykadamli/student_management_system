package com.example.student_management_system.Service;

import com.example.student_management_system.Model.Department;
import com.example.student_management_system.Repository.DepartmentRepository;
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
public class DepartmentServiceImpl {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll(){
        return (List<Department>) departmentRepository.findAll();
    }

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    public Optional<Department> findById(int id){
        return departmentRepository.findById(id);
    }

    public void delete(Department department){
        departmentRepository.delete(department);
    }
}
