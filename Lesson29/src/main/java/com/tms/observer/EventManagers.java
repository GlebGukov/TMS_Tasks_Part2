package com.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class EventManagers extends Observable {

    public void addEvent (Object o){
        System.out.println("Оповещаем подписчиков...");
        setChanged();
        notifyObservers(o);
    }

}
