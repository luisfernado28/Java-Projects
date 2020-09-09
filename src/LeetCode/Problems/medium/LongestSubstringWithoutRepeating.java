package LeetCode.Problems.medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args){
        lengthOfLongestSubstring("abcabcbb");
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet characters= new HashSet();
        for (char letter : s.toCharArray()){
            if (!characters.contains(letter)){
                characters.add(letter);
            }
        }
        //System.out.println(Arrays.toString(characters.toArray()));

    }
}
