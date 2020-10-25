package LeetCode.Problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExpressiveWords {
    public static void main(String[] arg0){
        //System.out.println(expressiveWord("heeellooo", new String[]{"hello", "hi", "helo"}));
        //System.out.println(expressiveWord( "zzzzzyyyyy", new String[]{"zzyy","zy","zyy"}));
        System.out.println(expressiveWord( "aaa", new String[]{"aaaa"}));

    }

    public static int expressiveWord(String S, String[] words){
        GetSInfo Sword= new GetSInfo(S);
        //System.out.println(gsi.resword);
        //System.out.println(Arrays.toString(gsi.count.toArray()));
        int cont=0;
        search: for (String s:words) {
            GetSInfo ActualWord= new GetSInfo(s);
            if (!Sword.resword.equals( ActualWord.resword)) continue;
            for (int i = 0; i < ActualWord.count.size() ; i++) {
                if(Sword.count.get(i) <3 && Sword.count.get(i) != ActualWord.count.get(i) || Sword.count.get(i) < ActualWord.count.get(i)){
                        continue search;

                }
            }
            cont++;
        }

        return cont;
    }

}

class GetSInfo{
    String resword;
    ArrayList<Integer> count;

    public GetSInfo(String word){
        count = new ArrayList<Integer>();
        StringBuilder sc= new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c= word.charAt(i);
            int cont=1;
            while (i< word.length()-1 && c==word.charAt(i+1) ){
                i++;
                cont++;
            }
            sc.append(c);
            count.add(cont);
        }
        resword= sc.toString();
    }
}
