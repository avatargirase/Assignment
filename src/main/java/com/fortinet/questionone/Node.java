package com.fortinet.questionone;

/**
 * Created by Avatar Girase Using Intellij on 8/14/2017.
 */
class Node {

    public Node next;
    public int value;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value) {
        this(value, null);
    }

    // For checking equality of two nodes and subsequent nodes if any
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (value != node.value) return false;
        return (next == null && node.next == null) || next.equals(node.next);
    }

    @Override
    public int hashCode() {
        System.out.println("Called");
        int result = 31 * value;
        if (next != null) {
            result *= next.hashCode();
        }
        return result;
    }

    //To Print Node and its subsequent Nodes
    @Override
    public String toString() {
        // StringBuilder used to get mutable string object
        StringBuilder builder = new StringBuilder();
        Node pointer = this;
        while (pointer != null) {
            builder.append(pointer.value).append("\n");
            pointer = pointer.next;
        }
        return builder.toString();
    }
}
