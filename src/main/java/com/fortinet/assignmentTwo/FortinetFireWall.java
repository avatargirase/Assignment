package com.fortinet.assignmentTwo;

/**
 * Created by Avatar Girase on 8/20/2017.
 */
public class FortinetFireWall extends Observer {

    public FortinetFireWall(SecuredMachine securedMachine) {
        this.securedMachine = securedMachine;
        securedMachine.attachObserver(this);

    }

    public void update(String state) {
        System.out.println("Fortinet  Firewall Received Notification");
        System.out.println("State Of Secured machine Changed to  ==> " + state  );
    }

}
