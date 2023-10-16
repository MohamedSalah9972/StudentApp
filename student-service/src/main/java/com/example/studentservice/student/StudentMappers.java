package com.example.studentservice.student;

import com.example.studentapi.dto.student.StudentDto;

public class StudentMappers {
    public static StudentDto of(StudentEntity studentEntity) {
        return new StudentDto(
                studentEntity.getId(),
                studentEntity.getName(),
                studentEntity.getEmail()
        );
    }
}
