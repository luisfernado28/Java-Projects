package LeetCode.Problems.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] arg0){
//        System.out.println(Arrays.toString(rotate(new int[]{1,2,3,4,5,6,7},3)));

  //      System.out.println(Arrays.toString(rotate(new int[]{-1,-100,3,99},2)));
        System.out.println(Arrays.toString(rotate(new int[]{-1},2)));

    }

    public static int[] rotate(int[] nums, int k) {
        if (nums.length>1) {
            int L = nums.length;
            int initial = L - k;
            int j = 0;
            int[] r = new int[nums.length];
            for (int i = initial; i < nums.length; i++) {
                r[j] = nums[i];
                j++;
            }
            for (int i = 0; i < initial; i++) {
                r[j] = nums[i];
                j++;
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = r[i];
            }
            return nums;
        }
        return nums;
    }
}
