package com.tms.service;

import com.tms.dto.Horse;
import com.tms.dto.Jockey;
import com.tms.dto.Rider;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class ListJockey implements DAO {
    private List<Jockey> jockeyList = new ArrayList<>();

    public ListJockey(List<Jockey> jockeyList) {
        this.jockeyList = jockeyList;
    }

    public ListJockey() {
    }

    @Override
    public Jockey save(Jockey jockey) {
        getJockeyList().add(jockey);
        return jockey;
    }

    @Override
    public Jockey getId(int id) {
        return getJockeyList().stream().filter(jockey -> jockey.getRider().getRegistrationNumber() == id).findAny().orElse(null);
    }

    @Override
    public List<Jockey> getAll() {
        return jockeyList;
    }

    @Override
    public String deleteId(int id) {
        boolean b = getJockeyList().removeIf(jockey -> jockey.getRider().getRegistrationNumber() == id);
        return "Status = " + b;
    }
}
