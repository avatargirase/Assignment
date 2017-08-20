package com.fortinet.assignmentTwo;

/**
 * Created by Avatar Girase on 8/20/2017.
 */
public class FireWallDemo {

    public static void main(String[] args) {

        SecuredMachine securedMachine = new SecuredMachine();
        FortinetFireWall fortinetFireWall = new FortinetFireWall(securedMachine);


        securedMachine.setState("Invalid");

    }
}
