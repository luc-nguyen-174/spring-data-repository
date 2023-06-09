package com.example.demospringdatarepository.service;

import java.util.Optional;

public interface IStudentService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
