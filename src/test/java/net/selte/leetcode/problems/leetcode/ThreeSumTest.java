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
class ThreeSumTest {
    @Test
    void threeSumTest() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum.threeSum(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(-1);
        a.add(-1);
        a.add(2);
        ans.add(a);

        List<Integer> b = new ArrayList<>();
        b.add(-1);
        b.add(0);
        b.add(1);
        ans.add(b);

        assertEquals(lists, ans);
    }
}
