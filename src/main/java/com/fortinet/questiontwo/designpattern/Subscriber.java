package com.fortinet.questiontwo.designpattern;

/**
 * Created by Avatar Girase on 8/16/2017.
 */
public abstract class Subscriber  {

    protected NewsPublisher newsPublisher;
    abstract void upate(String news);

}
