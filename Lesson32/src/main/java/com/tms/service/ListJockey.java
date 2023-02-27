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
public class ListJockey {
    private List<Jockey> jockeyList = new ArrayList<>();

    public ListJockey(List<Jockey> jockeyList) {
        this.jockeyList = jockeyList;
    }

    public ListJockey() {
    }

    public Jockey save(Object arg) {
        getJockeyList().add((Jockey) arg);
        return (Jockey) arg;
    }

    public Jockey getId(int id) {
        return getJockeyList().stream().filter(jockey -> jockey.getRider().getRegistrationNumber() == id).findAny().orElse(null);
    }

    public List<Jockey> getAll() {
        return jockeyList;
    }

    public String deleteId(int id) {
        boolean b = getJockeyList().removeIf(jockey -> jockey.getRider().getRegistrationNumber() == id);
        return "Status = " + b;
    }
}
