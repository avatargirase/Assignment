package com.fortinet.assignmentOne;

/**
 * Created by Avatar Girase Using Intellij on 8/19/2017.
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node pointer = this;
        while (pointer != null) {
            builder.append(pointer.value).append("\n");
            pointer = pointer.next;
        }
        return builder.toString();
    }
}
