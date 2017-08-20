package com.fortinet.assignmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avatar Girase on 8/20/2017.
 */
public class SecuredMachine {

    private String state = "Valid";

    private List<Observer> observers = new ArrayList();

    public SecuredMachine() {
        System.out.println("Secured Machine with state as " + state + " Created");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObserver();
    }

    private void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }
}
