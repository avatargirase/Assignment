package com.fortinet.assignment;

public class NodeBuilder {

    public Node head;
    public Node tail;

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