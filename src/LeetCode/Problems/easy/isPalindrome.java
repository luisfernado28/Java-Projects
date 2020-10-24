package LeetCode.Problems.easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

public class isPalindrome {

    public static void main(String[] arg0){

        System.out.println(isPalindrom(23432));
    }

    public static boolean isPalindrom(int number){
        // Validate that the number is not negative
        if (number<0 || (number %10 ==0))
            return false;

        //inverted number
        int invertedNumber=0;

        //Get half of the characters of the number
        while (number>invertedNumber){
            invertedNumber= (invertedNumber*10) +(number%10);
            number /=10;
        }


        return invertedNumber== number || invertedNumber/10 != number ;
    }
}
