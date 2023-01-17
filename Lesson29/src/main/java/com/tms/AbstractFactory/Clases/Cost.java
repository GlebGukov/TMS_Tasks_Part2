package com.tms.AbstractFactory.Clases;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cost {
    private String currency;
    private StringBuilder cost;
}
