package net.selte.leetcode.problems.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * Alice 有 n 枚糖，其中第 i 枚糖的类型为 candyType[i] 。Alice 注意到她的体重正在增长，所以前去拜访了一位医生。
 * <p>
 * 医生建议 Alice 要少摄入糖分，只吃掉她所有糖的 n / 2 即可（n 是一个偶数）。Alice 非常喜欢这些糖，她想要在遵循医生建议的情况下，尽可能吃到最多不同种类的糖。
 * <p>
 * 给你一个长度为 n 的整数数组 candyType ，返回： Alice 在仅吃掉 n / 2 枚糖的情况下，可以吃到糖的最多种类数。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：candyType = [1,1,2,2,3,3]
 * 输出：3
 * 解释：Alice 只能吃 6 / 2 = 3 枚糖，由于只有 3 种糖，她可以每种吃一枚。
 * 示例 2：
 * <p>
 * 输入：candyType = [1,1,2,3]
 * 输出：2
 * 解释：Alice 只能吃 4 / 2 = 2 枚糖，不管她选择吃的种类是 [1,2]、[1,3] 还是 [2,3]，她只能吃到两种不同类的糖。
 * 示例 3：
 * <p>
 * 输入：candyType = [6,6,6,6]
 * 输出：1
 * 解释：Alice 只能吃 4 / 2 = 2 枚糖，尽管她能吃 2 枚，但只能吃到 1 种糖。
 *  
 * <p>
 * 提示：
 * <p>
 * n == candyType.length
 * 2 <= n <= 104
 * n 是一个偶数
 * -105 <= candyType[i] <= 105
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode-cn.com/problems/distribute-candies">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
@Slf4j
public class DistributeCandies {

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        DistributeCandies dc = new DistributeCandies();
        int i = dc.distributeCandies(candyType);
        System.out.println(i);
    }

    public int distributeCandies(int[] candyType) {
        log.info("Given: " + Arrays.toString(candyType)
                + " Length: " + candyType.length);
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        int getHalf = candyType.length / 2;
        log.info("(candyType.length) " + candyType.length + " / 2 = " + getHalf);
        log.info("Now the set is: " + set);
        System.out.println("------------End------------");
        return Math.min(set.size(), getHalf);
    }
}
