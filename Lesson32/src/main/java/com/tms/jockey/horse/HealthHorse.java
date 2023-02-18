package com.tms.jockey.horse;

import org.springframework.stereotype.Service;

@Service
public interface HealthHorse {

    double efficiency(Temperaments temperaments);

}
