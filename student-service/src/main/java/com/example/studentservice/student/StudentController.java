package com.example.studentservice.student;

import com.example.studentapi.api.StudentApi;
import com.example.studentapi.dto.student.StudentDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/v1")
@RestController
public class StudentController implements StudentApi {
    private final StudentService studentService;

    @Override
    public Mono<StudentDto> getStudent(Integer studentId) {
        return studentService.getStudent(studentId);
    }
}
