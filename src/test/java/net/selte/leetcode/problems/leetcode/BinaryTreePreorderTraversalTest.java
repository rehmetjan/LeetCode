package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
class BinaryTreePreorderTraversalTest {

    @Test
    public void test1() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
        List<Integer> integers = binaryTreePreorderTraversal.preorderTraversal(new TreeNode(1));
        int size = integers.size();
        assertEquals(1, size);
        //todo
    }

}
