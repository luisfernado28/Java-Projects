package LeetCode.Problems.easy;

public class ReverseInteger {
    public static void main(String[] args){

        System.out.println(reverse(153426469));

    }

    public static int reverse(int x) {
        int res=x%10;
        x/=10;

        while (x!=0){
            int newNum=x%10;
            x/=10;
            res = Math.addExact(newNum , (res*10));

       }
       return res;



    }
}
