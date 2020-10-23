package CTCI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckPermutations {
    public static void main(String[] arg0){
        System.out.println(makepermutation( "Abcdd","addbc"));
    }

    public static boolean makepermutation(String w1,String w2){
        if(w1.length() != w2.length() ){return false;}
        char[] sw1= w1.toCharArray();
        Arrays.sort(sw1);
        char[] sw2= w2.toCharArray();
        Arrays.sort(sw2);
        sw1.equals(sw2);
        return true;


    }

}
