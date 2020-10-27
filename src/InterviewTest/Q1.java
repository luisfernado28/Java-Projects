package InterviewTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q1 {

    static int solution(Integer[] A) {
        ArrayList<Integer> minheight= new ArrayList<Integer>();
        minheight.add(A[0]);
        for (int i = 1; i < A.length ; i++) {
            int currentsize= minheight.size();
            for (int j = 0; j < currentsize ; j++) {
                if(A[i]< minheight.get(j)){
                    j=minheight.size();
                    continue;
                }
             minheight.add(A[i]);
            }
        }

        return minheight.size();
    }

    public static void main(String[] args) {
        // Read from stdin, solve the problem, write answer to stdout.

        System.out.print(solution(new Integer[]{5,4,3,6,1}));
    }


}
