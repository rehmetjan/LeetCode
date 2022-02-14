package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class UniquePathsTest {

    UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void test1() {
        int result = uniquePaths.uniquePaths(3, 7);
        assertEquals(28, result);
    }

    @Test
    public void test2() {
        int result = uniquePaths.uniquePaths2(3, 2);
        assertEquals(3, result);
    }
}
