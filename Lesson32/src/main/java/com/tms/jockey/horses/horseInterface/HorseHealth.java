package com.tms.jockey.horses.horseInterface;

import com.tms.jockey.horses.myEnum.Temperament;
import org.springframework.stereotype.Service;

@Service
public interface HorseHealth {
    double runningSpeed(Temperament temperament);
    

}
