package com.fortinet.questiontwo;

/**
 * Created by Avatar Girase on 8/20/2017.
 */

// Observer Class
public class SMSSubscriber extends Subscriber {

    public SMSSubscriber(NewsPublisher newsPublisher) {
        this.newsPublisher = newsPublisher;
        newsPublisher.register(this);
    }

    void upate(String news) {
        System.out.println("SMS subscriber received a News on Phone : " + news + "\n");
    }
}
