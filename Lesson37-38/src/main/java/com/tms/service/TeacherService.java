package com.tms.service;

import com.tms.domain.CourseEntity;
import com.tms.domain.TeacherEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode

@Service
public class TeacherService extends SessionService {
    private SessionFactory sessionFactory;

    public void save(TeacherEntity teacherEntity) {
        Session session = openSession();
        CourseEntity courseEntity = teacherEntity.getCourseEntity();
        courseEntity.setTeacherEntity(teacherEntity);
        session.save(teacherEntity);
        session.save(courseEntity);
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
