package com.tms.service;

import com.tms.dto.Jockey;

public interface DAO <T>{
    T save(T arg);
    T getId(int id);
    T getAll();
    T deleteId(int id);

}
