package com.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Embedded;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Jockey {
    @Embedded
    private Horse horse;
    @Embedded
    private Rider rider;

    @Override
    public String toString() {
        return "Jockey: horse type " + horse.name()  +" "+ rider;
    }
}
