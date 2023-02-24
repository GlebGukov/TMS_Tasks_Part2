package com.tms.config;

import com.tms.dto.Horse;
import com.tms.dto.Temperaments;
import com.tms.dto.TypeOfTrack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    Horse arabian() {
        return Horse.Arabian;
    }

    @Bean
    Horse trotter() {
        return Horse.Trotter;
    }

    @Bean
    Horse belarusian() {
        return Horse.Belarusian;
    }

    @Bean
    Horse thoroughbreds() {
        return Horse.Thoroughbreds;
    }

    @Bean
    Temperaments choleric() {
        return Temperaments.Choleric;
    }

    @Bean
    Temperaments melancholic() {
        return Temperaments.Melancholic;
    }

    @Bean
    Temperaments sanguine() {
        return Temperaments.Sanguine;
    }

    @Bean
    Temperaments phlegmatic() {
        return Temperaments.Phlegmatic;
    }

    @Bean
    TypeOfTrack easyTrack() {
        return TypeOfTrack.EasyTrack;
    }

    @Bean
    TypeOfTrack defaultTrack() {
        return TypeOfTrack.DefaultTrack;
    }

    @Bean
    TypeOfTrack difficultTrack() {
        return TypeOfTrack.DifficultTrack;
    }


}
