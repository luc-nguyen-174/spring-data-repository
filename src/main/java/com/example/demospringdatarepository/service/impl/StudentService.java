package com.example.demospringdatarepository.service.impl;

import com.example.demospringdatarepository.model.Student;
import com.example.demospringdatarepository.repository.IStudentRepo;
import com.example.demospringdatarepository.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StudentService implements IStudentService<Student> {
    @Autowired
    private IStudentRepo studentRepo;
    @Override
    public Iterable<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepo.findById(id);
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void remove(Long id) {
        studentRepo.deleteById(id);
    }
}
