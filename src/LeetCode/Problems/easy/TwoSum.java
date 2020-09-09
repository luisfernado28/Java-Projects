package LeetCode.Problems.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] arg0) {
        int[] r = twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        System.out.println(Arrays.toString(r));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length ; i++) {
            int tofind = target - nums[i];
            if (map.containsKey(tofind)   ){
                return new int[]{i,map.get(tofind)};
            }
            map.put(nums[i],i);
        }
        throw  new IllegalArgumentException("no such sum");
    }
}
