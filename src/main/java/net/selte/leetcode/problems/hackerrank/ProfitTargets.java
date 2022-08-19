package net.selte.leetcode.problems.hackerrank;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Slf4j
public class ProfitTargets {
    public static void main(String[] args) {
        List<Integer> sp = new ArrayList<>();
        sp.add(5);
        sp.add(7);
        sp.add(9);
        sp.add(13);
        sp.add(11);
        sp.add(6);
        sp.add(6);
        sp.add(3);
        sp.add(3);

        int result = ProfitTargets.stockPairs(sp, 12);

        System.out.println(result);
    }

    public static int stockPairs(List<Integer> stockProfit, long target) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < stockProfit.size(); i++) {
            if (!set.contains(stockProfit.get(i))) {
                for (int j = 0; j < stockProfit.size(); j++) {
                    if (stockProfit.get(i) + stockProfit.get(j) == target) {
                        log.info("stockProfit.get({}): {}", i, stockProfit.get(i));
                        log.info("stockProfit.get({}): {}", j, stockProfit.get(j));
                        log.info("stockProfit.get(i) + stockProfit.get(j): {} +  {}", stockProfit.get(i), stockProfit.get(j));
                        set.add(stockProfit.get(i));
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
