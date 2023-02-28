package com.tms;

import com.tms.domain.Teacher;
import com.tms.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.tms");
        Teacher firstTeacher = context.getBean("firstTeacher", Teacher.class);
        TeacherService teacherService = context.getBean(TeacherService.class);

        teacherService.save(firstTeacher);

    }
}
