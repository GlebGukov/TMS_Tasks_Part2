package com.tms.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString


@Entity
@Component
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numberOfStudents;
    private Boolean courseActive;

    @ToString.Exclude
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private TeacherEntity teacherEntity;


}
