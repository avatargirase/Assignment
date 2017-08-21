package com.fortinet.questiontwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avatar Girase on 8/16/2017.
 */

// Observable (Subject) Class
public class BusinessNewsPublisher implements NewsPublisher {

    private List<Subscriber> subscribers = new ArrayList();
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        notifyAllObservers();
    }

    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifyAllObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.upate(news);
        }

    }

    public void unRegister(Subscriber subscriber) {
        int subscriberIndex = subscribers.indexOf(subscriber);

        if (subscriberIndex >=0 ) {

            subscribers.remove(subscriber);
            System.out.println("You are unsubscribed");
        }

    }

}
