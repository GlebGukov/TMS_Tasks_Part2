package com.tms.jockey;

import org.springframework.stereotype.Service;

@Service(value = "Jockey")
public interface Jockey {

    double speed();

    int number();
}
