package CTCI;

import java.util.HashSet;

public class IsUnique {

    public static void main(String[] arg0){
        System.out.println(isunique("qwertASDFASDFASFDASDFQWERNQIWFNQIUPWNFQIUNWF[QIUWNF"));
    }

    public static boolean isunique(String word){
        if (word.length()>256)
            return false;
        boolean[] letters= new boolean[256];
        for (Character c: word.toCharArray()) {
            int value= c-'A';
            if(letters[value]){
                return false;
            }
            letters[value]=true;
        }
        return true;
    }

}
