package com.tms;


import com.tms.horses.horseImpl.healthImpl.SickHorse;
import com.tms.horses.horseImpl.raceHorseImpl.Trotter;
import com.tms.horses.myEnum.Temperament;
import com.tms.horses.horseImpl.healthImpl.HealthyHorse;
import com.tms.horses.horseImpl.raceHorseImpl.Arabian;
import com.tms.myInterface.horseImpl.raceHorseImpl.Thoroughbreds;
import com.tms.track.trackImpl.DifficultTrackImpl;
import com.tms.track.trackImpl.StandardTrackImpl;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Jockey jockey1 = new Jockey(new Arabian(Temperament.Choleric,new HealthyHorse()), new Rider(29,20));
        Jockey jockey2 = new Jockey(new Trotter(Temperament.Sanguine,new SickHorse()),new Rider(2,25));
        Jockey jockey3 = new Jockey(new Thoroughbreds(Temperament.Choleric,new HealthyHorse()),new Rider(11,15));
        Jockey jockey4 = new Jockey(new Arabian(Temperament.Sanguine,new HealthyHorse()),new Rider(22,15));
        HorseRacing horseRacing = new HorseRacing();
        horseRacing.StartCompetitions(new DifficultTrackImpl(),jockey1,jockey3,jockey4,jockey2);
//        ApplicationContext context = new ClassPathXmlApplicationContext("springXml.xml");
//        Jockey bean1 = context.getBean(Jockey.class);
//        RaceHorse bean2 = context.getBean(RaceHorse.class);
//        Rider bean3 = context.getBean(Rider.class);
//        bean1.setRaceHorse(bean2);
//        bean1.setRider(bean3);

    }
}