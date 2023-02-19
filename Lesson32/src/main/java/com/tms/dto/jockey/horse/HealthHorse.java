package com.tms.dto.jockey.horse;

import org.springframework.stereotype.Service;

@Service
public interface HealthHorse {

    double efficiency(Temperaments temperaments);

}
