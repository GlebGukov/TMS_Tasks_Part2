package com.tms.domain;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberOfStudents;
    private boolean courseActive;

    @ToString.Exclude
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


}
