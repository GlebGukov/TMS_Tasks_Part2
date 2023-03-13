package com.tms.service;

import com.tms.domain.CourseEntity;
import com.tms.domain.StudentEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService extends SessionService {

    public void saveCourseToDataBase(CourseEntity course) {
        Session session = openSession();
        session.save(course);
        closeSession(session);
    }
    public List<StudentEntity> getAllStudents(CourseEntity course){
        Session session = openSession();
        List<StudentEntity> student = course.getStudent();
        closeSession(session);
        return student;
    }
}
