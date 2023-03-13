package com.tms;

import com.tms.domain.CourseEntity;
import com.tms.domain.StudentEntity;
import com.tms.domain.TeacherEntity;
import com.tms.dto.Address;
import com.tms.myEnum.Qualification;
import com.tms.service.CourseService;
import com.tms.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.tms");

        CourseEntity firstCourse = context.getBean("firstCourse", CourseEntity.class);
        CourseEntity secondCourse = context.getBean("secondCourse", CourseEntity.class);

        StudentEntity firstStudent = context.getBean("firstStudent", StudentEntity.class);
        StudentEntity secondStudent = context.getBean("secondStudent", StudentEntity.class);
        StudentEntity thirdStudent = context.getBean("thirdStudent", StudentEntity.class);
        StudentEntity fourthStudent = context.getBean("fourthStudent", StudentEntity.class);

        Address address = context.getBean(Address.class);
        address.setCity("Minsk");
        address.setIndex(2123044);

        TeacherEntity teacherFirst = context.getBean(TeacherEntity.class);
        teacherFirst.setName("Alex");
        teacherFirst.setDate(new Date());
        teacherFirst.setAddress(address);
        teacherFirst.setQualification(Qualification.FIRST_CATEGORY);
        teacherFirst.setAttestation(true);
        teacherFirst.setCourses(List.of(firstCourse, secondCourse));

        TeacherService teacherService = context.getBean(TeacherService.class);
        teacherService.save(teacherFirst);

        firstCourse.setStudent(List.of(firstStudent, secondStudent));
        secondCourse.setStudent(List.of(thirdStudent, fourthStudent));

        CourseService courseService = context.getBean(CourseService.class);

        courseService.saveCourseToDataBase(firstCourse);
        courseService.saveCourseToDataBase(secondCourse);

        TeacherEntity teacher = teacherService.get(1);
        System.out.println(teacher);
    }
}
