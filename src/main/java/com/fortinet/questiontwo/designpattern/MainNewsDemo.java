package com.fortinet.questiontwo.designpattern;

/**
 * Question 2. Describe the Scenario
 *
 * Consider a scenario where the news publisher wants to publish it's news to the different types
 * of subscriber as soon as the new news comes in. This creates a one to many relationship
 * between the news publisher and its subscribers and hence I am using a Observer design
 * pattern where the susbscriber will be notified as soon as the news is posted by the
 * news publisher they subscribed to. In this implemenation the SMS subscriber and Mail subscriber
 * both gets notified as soon as the news is set by the Business News Publisher.
 * Advantage Of Observer Pattern  :
 * 1) Decouple an object from those that want to watch it.
 * 2) Observer can take what they want by registering or unregistering from the publisher
 * 3) Observer need not have to pull information from the publiher.
 */
public class MainNewsDemo {

    public static void main(String[] args) {

        System.out.println("News Agency - Observer Pattern\n");
        NewsPublisher businessNewsPublisher  = new BusinessNewsPublisher();
        SMSSubscriber smsSubscriber = new SMSSubscriber(businessNewsPublisher);
        MailSubscriber mailSubscriber  = new MailSubscriber(businessNewsPublisher);
        businessNewsPublisher.setNews("Today's Breaking News: Fortinet has been named a “Leader” in the Gartner MQ for Enterprise Network Firewalls 2017");

    }
}
