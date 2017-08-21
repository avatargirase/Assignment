package com.fortinet.questiontwo;

/**
 * Created by Avatar Girase on 8/16/2017.
 */

// Observer Class
public class MailSubscriber extends Subscriber {


    public MailSubscriber(NewsPublisher newsPublisher) {
        this.newsPublisher = newsPublisher;
        newsPublisher.register(this);
    }

    void upate(String news) {
        System.out.println("Mail subscriber received a News in Mail: " + news + "\n");
    }
}
