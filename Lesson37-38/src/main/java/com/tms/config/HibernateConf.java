package com.tms.config;

import com.tms.domain.CourseEntity;
import com.tms.domain.StudentEntity;
import com.tms.domain.TeacherEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class HibernateConf {

    @Bean
    SessionFactory sessionFactory() {
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        properties.put(Environment.USER, "admin");
        properties.put(Environment.PASS, "admin");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL95Dialect");
        properties.put(Environment.HBM2DDL_AUTO, "create-drop");
        properties.put(Environment.SHOW_SQL, "true");
        configuration.addProperties(properties);

        configuration.addAnnotatedClass(TeacherEntity.class);
        configuration.addAnnotatedClass(CourseEntity.class);
        configuration.addAnnotatedClass(StudentEntity.class);

        return configuration.buildSessionFactory();
    }
}
