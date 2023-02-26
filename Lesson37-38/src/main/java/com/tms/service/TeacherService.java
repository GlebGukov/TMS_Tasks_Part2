package com.tms.service;

import com.tms.domain.StudentCourse;
import com.tms.domain.Teacher;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TeacherService {
    private final SessionFactory sessionFactory;

    public void save(Teacher teacher) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(teacher);
        StudentCourse studentCourse = teacher.getStudentCourse();
        session.save(studentCourse);
        transaction.commit();
        session.close();

    }

    public void delete(Integer id) {

    }

    public Object get(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher = session.find(Teacher.class,id);
        transaction.commit();
        session.close();
        return teacher;

    }
}
