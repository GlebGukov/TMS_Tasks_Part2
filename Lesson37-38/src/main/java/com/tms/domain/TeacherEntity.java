package com.tms.domain;

import com.tms.dto.Address;
import com.tms.myEnum.Qualification;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "teacher")
@Component
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Qualification qualification;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Embedded
    private Address address;
    @Column(name = "attestation")
    private Boolean attestation;

    @OneToMany(mappedBy = "teacher",fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    private List<CourseEntity> courses;
}
