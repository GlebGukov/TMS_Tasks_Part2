package com.tms.AbstractFactory.Clases;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {
    private String name;
    private long population;
    private String currency;
    private StringBuilder dopInfo;
}
