package com.tms.service;

import com.tms.domain.CourseEntity;
import com.tms.domain.TeacherEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService extends SessionService {
    public void save(TeacherEntity teacher) {
        Session session = openSession();

//        List<CourseEntity> courses = teacher.getCourses();
//        courses.forEach(session::save);

        session.save(teacher);
//        courses.forEach(courseEntity -> courseEntity.setTeacher(teacher));
        closeSession(session);
    }

    public void delete(Integer id) {
        Session session = openSession();
        TeacherEntity teacherEntity = session.find(TeacherEntity.class, id);
        session.delete(teacherEntity);
        closeSession(session);
    }

    public TeacherEntity get(Integer id) {
        Session session = openSession();
        TeacherEntity teacherEntity = session.find(TeacherEntity.class, id);
        closeSession(session);
        return teacherEntity;
    }
}
