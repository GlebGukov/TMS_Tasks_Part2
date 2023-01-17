package com.tms.observer;

import java.util.Observable;

public class EventManagers extends Observable {

    public void addEvent (String event){
        System.out.println("Оповещаем подписчиков...");
        setChanged();
        notifyObservers(event);
    }

}
