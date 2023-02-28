package com.tms.config;

import com.tms.Address;
import com.tms.domain.StudentCourse;
import com.tms.domain.Teacher;
import com.tms.myEnum.Qualification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JavaConfig {

    @Bean
    Address addressMinsk(){
        return Address.builder().city("Minsk").index(218484).build();
    }
    @Bean
    Address address2(){
        return Address.builder().city("Brest").index(222222).build();
    }
    @Bean
    StudentCourse studentCourse(){
        return StudentCourse.builder().courseActive(false).numberOfStudents(12).build();
    }


    @Bean
    Teacher firstTeacher(){
        return Teacher.builder().name("Name").address(addressMinsk()).date(new Date()).qualification(Qualification.SECOND_CATEGORY).studentCourse(studentCourse()).aBoolean(true).build();
    }
}
