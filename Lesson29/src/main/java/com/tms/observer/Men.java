package com.tms.observer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Men implements Observer {
    private String name;
    @Override
    public void update(Observable o, Object arg) {
        String arg1 = (String) arg;
        System.out.println(getName()+" received information about "+ arg1);
    }
}
