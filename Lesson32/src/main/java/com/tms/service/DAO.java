package com.tms.service;

import com.tms.dto.Jockey;

public interface DAO {
    Object save(Jockey jockey);
    Object getId(int id);
    Object getAll();
    Object deleteId(int id);

}
