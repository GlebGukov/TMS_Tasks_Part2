package com.tms.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Component
public class Rider {
    private int registrationNumber;
    @Override
    public String toString() {
        return " registration number =" + registrationNumber;
    }
}
