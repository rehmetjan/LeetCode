# **LeetCode** (Java + TDD)
## About

My [LeetCode](https://leetcode-cn.com/u/rehmetjan/) Journey (OpenSource)

Problems and Solution, with TDD _(Test Driven Development)_


My LeetCode: [https://leetcode-cn.com/u/rehmetjan/](https://leetcode-cn.com/u/rehmetjan/)

### Project
Spring Boot Project (Version 2.5.6)
Unit Test: JUnit 5.7.2

### How to get the code?

1.  `git clone https://gitee.com/rehmet/leetcode.git`

### How to run?

1.  mvn spring-boot:run

##Example
### 217. Contains Duplicate
https://leetcode-cn.com/problems/contains-duplicate/solution/

Given an integer array nums, 

return true if any value appears at least twice in the array,

and return false if every element is distinct.

给定一个整数数组，判断是否存在重复元素。

如果存在一值在数组中出现至少两次，函数返回 true 。

如果数组中每个元素都不相同，则返回 false 。

```text
Example 1:
Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/contains-duplicate
```
###write test first

```java
import com.example.coding.problems.leetcode.ContainsDuplicate;

public class ContainsDuplicateTest {

    ContainsDuplicate cd =new ContainsDuplicate();

    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 7, 5, 5};
        assertTrue(cd.containsDuplicate(nums));
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 7, 5};
        assertFalse(cd.containsDuplicate(nums));
    }
}
```
###这时候我们的class还是这样的
`**注意：**`（还没有写code，只是生成了method and return false）:
```java
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        return false;
    }
}

```

### test fails, and write code to let test pass
```java
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
```
