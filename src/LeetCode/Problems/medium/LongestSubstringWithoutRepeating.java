package LeetCode.Problems.medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args){

        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet characters= new HashSet();
        int limit=s.length();
        int i=0, j=0,ans=0;
        while (i< limit && j < limit){
            if(!characters.contains(s.charAt(j))){
                characters.add(s.charAt(j));
                j++;
                ans= Math.max(ans, j-i);
            }else {
                characters.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
