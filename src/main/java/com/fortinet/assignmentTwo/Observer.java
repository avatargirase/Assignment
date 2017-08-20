package com.fortinet.assignmentTwo;

/**
 * Created by Avatar Girase on 8/20/2017.
 */
public abstract class Observer {

    protected SecuredMachine securedMachine;
    public abstract void update(String state);

}
