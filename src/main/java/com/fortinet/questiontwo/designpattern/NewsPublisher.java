package com.fortinet.questiontwo.designpattern;

/**
 * Created by Avatar Girase on 8/16/2017.
 */


public interface NewsPublisher {


    public void register(Subscriber subscriber);

    public void notifyAllObservers();

    public void unRegister(Subscriber subscriber);

    public void setNews(String news);

}
