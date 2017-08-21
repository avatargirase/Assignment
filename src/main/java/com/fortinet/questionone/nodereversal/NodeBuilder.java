package com.fortinet.questionone.nodereversal;

/**
 * Created by Avatar Girase Using Intellij on 8/14/2017.
 */


public class NodeBuilder {

    public Node head;
    public Node tail;

    // For adding nodes
    public NodeBuilder add(int value) {
        Node node = new Node(value);
        if (head != null) {
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
        return this;
    }

    public Node build() {
        return head;
    }
}