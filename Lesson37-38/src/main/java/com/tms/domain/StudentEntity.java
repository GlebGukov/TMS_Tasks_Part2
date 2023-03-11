package com.tms.domain;

import com.tms.myEnum.Sex;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

@Entity(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int age;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @ToString.Exclude
    @ManyToMany(mappedBy = "student",fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List <CourseEntity> course;

}
