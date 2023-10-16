package com.example.studentservice.student;

import com.example.studentapi.dto.student.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public Mono<StudentDto> getStudent(Integer studentId) {
        return studentRepository.findByStudentId(studentId).
        switchIfEmpty(Mono.error(new RuntimeException("Student not found!"))).
        doOnError(error -> System.out.println(error.getMessage())).
        map(StudentMappers::of);
    }
}
