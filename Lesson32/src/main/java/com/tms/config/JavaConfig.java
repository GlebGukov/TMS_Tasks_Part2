package com.tms.config;

import com.tms.dto.jockey.horse.Temperaments;
import com.tms.dto.track.TypeOfTrack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tms")
public class JavaConfig {
    @Bean
    Temperaments Choleric(){
        return Temperaments.Choleric;
    }
    @Bean
    Temperaments Melancholic(){
        return Temperaments.Melancholic;
    }
    @Bean
    Temperaments Phlegmatic(){
        return Temperaments.Phlegmatic;
    }
    @Bean
    Temperaments Sanguine(){
        return Temperaments.Sanguine;
    }
    @Bean
    TypeOfTrack track(){
        return TypeOfTrack.EasyTrack;
    }


}
