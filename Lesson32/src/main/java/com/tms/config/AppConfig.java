package com.tms.config;

import com.tms.HorseRacing;
import com.tms.jockey.Jockey;
import com.tms.jockey.horses.RaceHorse;
import com.tms.jockey.horses.horseImpl.healthImpl.HealthyHorse;
import com.tms.jockey.horses.horseImpl.healthImpl.SickHorse;
import com.tms.jockey.horses.horseImpl.raceHorseImpl.Arabian;
import com.tms.jockey.horses.horseImpl.raceHorseImpl.Belarusian;
import com.tms.jockey.horses.horseImpl.raceHorseImpl.Thoroughbreds;
import com.tms.jockey.horses.horseImpl.raceHorseImpl.Trotter;
import com.tms.jockey.horses.myEnum.Temperament;
import com.tms.jockey.rider.Rider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.tms.aop"})
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    RaceHorse thoroughbreds() {
        return new Thoroughbreds(Temperament.Choleric, new SickHorse());
    }

    @Bean
    RaceHorse trotter() {
        return new Trotter(Temperament.Choleric, new HealthyHorse());
    }

    @Bean
    RaceHorse arabian() {
        return new Arabian(Temperament.Sanguine, new HealthyHorse());
    }

    @Bean
    RaceHorse belka() {
        return new Belarusian(Temperament.Melancholic, new HealthyHorse());
    }

    @Bean
    Rider rider12() {
        return new Rider(12, 10);
    }

    @Bean
    Rider rider22() {
        return new Rider(22, 12);
    }

    @Bean
    Rider rider41() {
        return new Rider(41, 15);
    }

    @Bean
    Rider rider1() {
        return new Rider(1, 20);
    }

    @Bean
    Jockey jockey1(RaceHorse belka, Rider rider1) {
        return new Jockey(belka, rider1);
    }
    @Bean
    Jockey jockey2(RaceHorse thoroughbreds, Rider rider41) {
        return new Jockey(thoroughbreds, rider41);
    }
    @Bean
    Jockey jockey3(RaceHorse trotter, Rider rider12) {
        return new Jockey(trotter, rider12);
    }
    @Bean
    Jockey jockey4(RaceHorse arabian, Rider rider22) {
        return new Jockey(arabian, rider22);
    }
    @Bean
    HorseRacing horseRacing(){
        return new HorseRacing();
    }


}


