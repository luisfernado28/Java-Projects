

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T= sc.nextInt();
	    sc.nextLine();
        for (int i = 0; i < T; i++) {
            String N=sc.nextLine();
            char[] digits= N.toCharArray();
            String A="";
            String B="";
            for (int j = 0; j < digits.length ; j++) {
                if(digits[j] == '4'){
                    A= A+1;
                    B=B+3;
                }else{
                    if(A != ""){
                        A= A+0;
                    }
                    B=B+digits[j];
                }
            }
           System.out.print("Case #"+ (i+1) + ": " +A+" "+B);
        }

    }
}
