package com.example.studentservice.student;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface StudentRepository extends ReactiveCrudRepository<StudentEntity, Integer> {
    Mono<StudentEntity> findByStudentId(Integer studentId);
}
