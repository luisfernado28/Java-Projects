package LeetCode.Problems.easy;

public class BestTimetoBuyandSellStockII {

    public static void main(String[] arg0){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));

        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
    }


    public static int maxProfit(int[] prices) {
        int totalmoneywon=0;
        int selled=0;
        int L= prices.length;

        for (int i = 0; i < L ; i++) {
            while (i< L-1 && prices[i]>=prices[i+1])
                i++;
            selled=prices[i];
            while (i< L-1 && prices[i]<=prices[i+1])
                i++;
            totalmoneywon += (prices[i]-selled);
        }
        return totalmoneywon;
    }
}
