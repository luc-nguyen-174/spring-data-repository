package com.example.demospringdatarepository.repository;

import com.example.demospringdatarepository.model.Student;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface IStudentRepo extends CrudRepository<Student, Long> {
    
}
