package Exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForegoneSolution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T= sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String N=sc.nextLine();
            char[] digits= N.toCharArray();
            StringBuilder A= new StringBuilder();
            StringBuilder B= new StringBuilder();
            for (char digit : digits) {
                if (digit == '4') {
                    A.append(1);
                    B.append(3);
                } else {
                    if (A.toString() != "") {
                        A.append(0);
                    }
                    B.append(digit);
                }
            }
            System.out.println("Case #"+ i + ": " +A+" "+B);
        }

    }
}
