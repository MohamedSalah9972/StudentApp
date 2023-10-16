package com.example.studentservice.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder(toBuilder = true)
@Table("students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    private Integer id;
    private String name;
    private String email;
}
