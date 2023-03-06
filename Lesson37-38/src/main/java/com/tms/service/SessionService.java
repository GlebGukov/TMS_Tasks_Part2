package com.tms.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Service
public class SessionService {
    @Autowired
    private SessionFactory factory;

    public Session openSession(){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        return session;
    }

    public void closeSession(Session session){
        Transaction transaction = session.getTransaction();
        transaction.commit();
        session.close();
    }
}
