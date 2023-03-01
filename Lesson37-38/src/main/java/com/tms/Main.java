package com.tms;

import com.tms.domain.CourseEntity;
import com.tms.domain.TeacherEntity;
import com.tms.myEnum.Qualification;
import com.tms.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.tms");

        CourseEntity courseEntity = context.getBean(CourseEntity.class);
        courseEntity.setNumberOfStudents(20);
        courseEntity.setCourseActive(true);


        Address address = context.getBean(Address.class);
        address.setCity("Minsk");
        address.setIndex(2123044);

        TeacherEntity teacherEntityFirst = context.getBean(TeacherEntity.class);
        teacherEntityFirst.setName("Alex");
        teacherEntityFirst.setDate(new Date());
        teacherEntityFirst.setAddress(address);
        teacherEntityFirst.setQualification(Qualification.FIRST_CATEGORY);
        teacherEntityFirst.setAttestation(true);
        teacherEntityFirst.setCourseEntity(courseEntity);

        TeacherService teacherService = context.getBean(TeacherService.class);
        teacherService.save(teacherEntityFirst);
    }
}
