package com.fortinet.questionone.nodereversal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Avatar Girase on 8/15/2017.
 */
public class NodeUtilTest {

    private NodeUtil nodeUtil = new NodeUtil();

    @Test
    public void reverseList() throws Exception {
        // Node list 1->2->3->4 should match with Node List 4->3->2->1
        Node actualList = new NodeBuilder().add(1).add(2).add(3).add(4).build();
        Node expectedReversedNode = new NodeBuilder().add(4).add(3).add(2).add(1).build();
        Node actualReversedNode = nodeUtil.reverseList(actualList);
        Assert.assertEquals("Expected and Actual List don't match", expectedReversedNode, actualReversedNode);
    }

    @Test
    public void reverseNullList() throws Exception {
        // Null node will be returned as Null node
        Node nullNode = null;
        Node actualReversedNode = nodeUtil.reverseList(nullNode);
        Assert.assertEquals("Expected and Actual List don't match", nullNode, actualReversedNode);
    }

    @Test
    public void reverseListWithSameElement() throws Exception {
        // Node list 1->1->1->1 should match with Node List 1->1->1->1
        Node actualList = new NodeBuilder().add(1).add(1).add(1).add(1).build();
        Node expectedReversedNode = new NodeBuilder().add(1).add(1).add(1).add(1).build();
        Node actualReversedNode = nodeUtil.reverseList(actualList);
        Assert.assertEquals("Expected and Actual List don't match", expectedReversedNode, actualReversedNode);
    }

    @Test
    public void reverseListWithSinglElement() throws Exception {
        // The List has only one node so original node list and reversed node list should match
        Node singleNode = new NodeBuilder().add(1).build();
        Node reversedSingleNode = nodeUtil.reverseList(singleNode);
        Assert.assertEquals("Expected and Actual List don't match", singleNode, reversedSingleNode);
    }


    @Test(expected = AssertionError.class)
    public void reverseMismatchList() throws Exception {
        //Two List with MisMatch of values should not match with each other
        Node actualList = new NodeBuilder().add(1).add(2).add(3).add(4).build();
        Node expectedReversedNode = new NodeBuilder().add(4).add(3).add(2).add(8).build();
        Node actualReversedNode = nodeUtil.reverseList(actualList);
        Assert.assertEquals("Expected and Actual List  Mismatch", expectedReversedNode, actualReversedNode);
    }
}
