package InterviewTest;

import java.util.Arrays;

public class Q2 {
    static int solution(Integer[] loads) {
        Arrays.sort(loads);
        boolean selectstack=true;
        int s1=loads[loads.length-1],s2=0;
        for (int i = (loads.length-2); i >=0 ; i--) {
            if(selectstack){
                if (s1+loads[i] > s2 ){
                    s2+=loads[i];
                    selectstack=false;
                }else {
                    s1 += loads[i];
                }
            }else {
                if (s2+loads[i] > s1 ){
                    s1 += loads[i];
                    selectstack=false;
                }else {
                    s2 += loads[i];
                }
            }
        }
        return Math.abs(s1-s2);
    }

    public static void main(String[] args) {

        System.out.print(solution(new Integer[]{1,2,3,4,5}));
    }
}
