package LeetCode.Problems.medium;

import java.util.*;

public class LongestContinuousSubarrayWithAbsolute {
    public static void main(String[] arg0){
         System.out.println(getSubstringSize(new int[]{10,1,2,4,7,2},5)); //4
         System.out.println(getSubstringSize(new int[]{4,2,2,2,4,4,2,2},0)); //3
         System.out.println(getSubstringSize(new int[]{8,2,4,7},4)); //2

    }

    public static int getSubstringSize(int[] nums, int limit){
        if(nums.length==1) return 1;
        Deque<Integer> ar= new LinkedList<>();
        int i=0,j=0,max=0;
        while (i< nums.length &&  j< nums.length){
            if (ar.equals(null)  || ar.size() ==0){
                ar.add(nums[j]);
                j++;
            }else if(Math.abs(Collections.max(ar)-Collections.min(ar))>limit){
                ar.pop();
                i++;
            }else {
                max= Math.max(ar.size(),max);

                ar.add(nums[j]);
                j++;
            }

        }
        if(Math.abs(Collections.max(ar)-Collections.min(ar))<=limit){
            max= Math.max(ar.size(),max);

        }

        return max;
    }

}
