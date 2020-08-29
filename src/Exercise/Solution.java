package Exercise;
import java.io.*;
import java.util.*;

public class Solution {

    public static StringBuilder res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = sc.nextInt();
        sc.nextLine();
        for (int k = 1; k <= T; k++) {
            res=new StringBuilder();
            String s= sc.nextLine();
            char[] digits= s.toCharArray();
            boolean lastflag=true;
            int lastingpar=0;
            for (int i = 0; i < s.length(); i++) {
                int num= Integer.parseInt(String.valueOf(digits[i]));
                if(lastflag){
                    StartParanthesis(num);
                    lastflag=false;
                    lastingpar=num;
                }else {
                    if(num<lastingpar){
                        int cont=lastingpar-num;
                        ContinueParanthesis(cont);
                    }else {
                        FinParanthesis(lastingpar);
                        lastflag=true;
                        lastingpar=0;
                    }
                }


            }

            System.out.println("Case #"+ k + ": " +res );
        }
    }

    public static void addParenthesis(int n){
        res.append('(');
        for (int i = 0; i < n; i++) {
            res.append('1');
        }
        res.append(')');
    }

    public static void StartParanthesis(int n){
        for (int i = 0; i < n; i++) {
            res.append('(');
        }
        res.append(n);
    }

    public static void ContinueParanthesis(int n) {
        for (int i = 0; i < n; i++) {
            res.append(')');
        }
        res.append(n);
    }
    public static void FinParanthesis(int n) {

        res.append(n);
        for (int i = 0; i < n; i++) {
            res.append(')');
        }
    }
}
