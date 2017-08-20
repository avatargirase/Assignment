package com.fortinet.assignmentOne;

public class NodeUtil {

    public Node reverseList(Node node) {
        Node currentNode, previousNode, nextNode;
        previousNode = null;
        currentNode = node;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
