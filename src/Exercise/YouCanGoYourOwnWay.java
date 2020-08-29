package Exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YouCanGoYourOwnWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T= sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            sc.nextLine();
            String Directions= sc.nextLine();
            StringBuilder Result= new StringBuilder();
            for (char digit: Directions.toCharArray()) {
                if(digit== 'E'){
                    Result.append('S');
                }else {
                    Result.append('E');
                }
            }

            System.out.println("Case #"+ i + ": " +Result  );
        }
    }
}
