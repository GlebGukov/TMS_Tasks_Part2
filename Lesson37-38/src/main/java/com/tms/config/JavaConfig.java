package com.tms.config;

import com.tms.domain.CourseEntity;
import com.tms.domain.StudentEntity;
import com.tms.myEnum.Sex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    CourseEntity firstCourse() {
        return CourseEntity.builder().courseActive(false).numberOfStudents(29).build();
    }

    @Bean
    CourseEntity secondCourse() {
        return CourseEntity.builder().courseActive(true).numberOfStudents(11).build();
    }

    @Bean
    StudentEntity firstStudent() {
        return StudentEntity.builder().age(22).sex(Sex.MALE).name("Bob").build();
    }

    @Bean
    StudentEntity secondStudent() {
        return StudentEntity.builder().age(31).sex(Sex.FEMALE).name("Anastasiya").build();
    }

    @Bean
    StudentEntity thirdStudent() {
        return StudentEntity.builder().age(27).sex(Sex.MALE).name("Roberto").build();
    }

    @Bean
    StudentEntity fourthStudent() {
        return StudentEntity.builder().age(19).sex(Sex.FEMALE).name("Roza").build();
    }
}
