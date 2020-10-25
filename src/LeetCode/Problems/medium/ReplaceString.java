package LeetCode.Problems.medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReplaceString {

    public static void main(String[] arg0){
        //System.out.println(minimumString("abcd",new int[]{0, 2},new String[]{"a", "cd"}, new String[]{"eee", "ffff"}));
        //System.out.println(minimumString("abcd",new int[]{0, 2},new String[]{"ab","ec"}, new String[]{"eee", "ffff"}));
        System.out.println(minimumString("jjievdtjfb",new int[]{4,6,1},new String[]{"md","tjgb","jf"}, new String[]{"foe","oov","e"}));

    }

    public static String minimumString(String S, int[] indexes, String[] sources, String[] targets){
        String[] chars= S.split("");
        Arrays.sort(indexes);
        for (int i = 0; i < indexes.length ; i++) {
            char Sposition = S.charAt(indexes[i]);
            char souceChar= sources[i].charAt(0);
            if (Sposition== souceChar){
                int lenggthOfConcurrence = sources[i].length();
                for (int j = (indexes[i]+1); j < (indexes[i]+lenggthOfConcurrence) ; j++) {
                    chars[j]="";
                }
                chars[indexes[i]]=targets[i];

            }
        }

        StringBuilder sm= new StringBuilder();
        for (String s:chars) {
            sm.append(s);
        }
        return sm.toString();
    }
}
