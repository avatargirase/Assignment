package com.fortinet.assignmentOne;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Avatar Girase on 8/19/2017.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void reverseList() throws Exception {
        Node actualList = new NodeBuilder().add(1).add(2).add(3).add(4).build();
        Node expectedReversedNode = new NodeBuilder().add(4).add(3).add(2).add(1).build();
        Node actualReversedNode = solution.reverseList(actualList);
        Assert.assertEquals("Expected and Actual List do match", expectedReversedNode, actualReversedNode);
    }

    @Test
    public void reverseNullList() throws Exception {
        Node nullNode = null;
        Node actualReversedNode = solution.reverseList(nullNode);
        Assert.assertEquals("Expected and Actual List don't match", nullNode, actualReversedNode);
    }

    @Test
    public void reverseListWithSinglElement() throws Exception {
        Node singleNode = new NodeBuilder().add(1).build();
        Node reversedSingleNode = solution.reverseList(singleNode);
        Assert.assertEquals("Expected and Actual List don't match", singleNode, reversedSingleNode);
    }


    @Test(expected = AssertionError.class)
    public void reverseMismatchList() throws Exception {
        Node actualList = new NodeBuilder().add(1).add(2).add(3).add(4).build();
        Node expectedReversedNode = new NodeBuilder().add(4).add(3).add(2).add(8).build();
        Node actualReversedNode = solution.reverseList(actualList);
        Assert.assertEquals("Expected and Actual List don't match", expectedReversedNode, actualReversedNode);
    }
}
