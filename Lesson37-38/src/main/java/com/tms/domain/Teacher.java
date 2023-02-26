package com.tms.domain;

import com.tms.Address;
import com.tms.myEnum.Qualification;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    @Enumerated
    private Qualification qualification;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Embedded
    private Address address;
    @Column (name = "Attestation")
    private Boolean aBoolean;

    @ToString.Exclude
    @OneToOne(mappedBy = "teacher")
    private StudentCourse studentCourse;
}
