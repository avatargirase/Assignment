package com.fortinet.questionone.nodereversal;

/**
 * Created by Avatar Girase Using Intellij on 8/14/2017.
 */

// NodeUtil class to have Utility Methods that operate on Nodes

public class NodeUtil {

    /*
    * This Method reverses the Node list. I could have made it static as
     * this method doesn't deal with the state of the object and hence no need
     * to create the object of NodeUtil Class to access this method.
     * Since In email the method definition is non static I created a non static method
    * */

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
