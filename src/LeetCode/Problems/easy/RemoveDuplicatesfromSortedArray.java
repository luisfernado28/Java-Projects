package LeetCode.Problems.easy;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] arg0){
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int j=0;
        for (int i = 1; i  < nums.length ; i++) {
            if (nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;

    }
}
