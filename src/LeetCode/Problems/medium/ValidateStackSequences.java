package LeetCode.Problems.medium;

import java.util.Stack;

public class ValidateStackSequences {

    public static void main(String[] arg0){
        System.out.println(stacksequence(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1}));
        System.out.println(stacksequence(new int[]{1,2,3,4,5},new int[]{4,3,5,1,2}));
        System.out.println(stacksequence(new int[]{1,0},new int[]{1,0}));

    }

    public static boolean stacksequence(int[] pushed,int[] popped){
        if(popped.length==0)return true;
        Stack<Integer> s= new Stack<Integer>();
        int j=0;
        for (int i = 0; i < pushed.length ; i++) {
            s.push(pushed[i]);
            while (!s.isEmpty()&& popped[j] == s.peek() && j < popped.length){
                s.pop();
                j++;
            }


        }
        return j==popped.length;
    }
}
