package LeetCode.Problems;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;

public class addtwonumbers {

    public static void main(String[] arg0){
        addTwoNumbers(
                new ListNode(9),
                new ListNode(1,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9,
                                                                                        new ListNode(9))))))))))
        );
    }

    static ListNode linkedRes;

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1=BigInteger.valueOf(0);
        BigInteger num2= BigInteger.valueOf(0);
        int cont=1;
        ListNode move= l1;
        while (move != null){
            if (move.val==0){
                cont=cont*10;
            }else {
                num1=num1.add(BigInteger.valueOf(move.val*cont));
                cont=cont*10;
            }
            move = move.next;
        }
        cont=1;
         move= l2;
        while (move != null){
            if (move.val==0){
                cont=cont*10;
            }else {
                num2=num2.add(BigInteger.valueOf(move.val*cont));
                cont=cont*10;
            }
            move = move.next;
        }
        BigInteger res= num1.add(num2);
        char[] resinarray= String.valueOf(res).toCharArray();
        System.out.println(Arrays.toString(resinarray)+" " + num1 + " " +num2);

        linkedRes = new ListNode( Character.getNumericValue(resinarray[resinarray.length-1]), filllist(resinarray,resinarray.length-2));
        return linkedRes;
    }

    public static ListNode filllist(char[] numbers,int cont){
        if (cont <0){
            return null;
        }else {
            return new ListNode(Character.getNumericValue(numbers[cont]), filllist(numbers,(cont-1)));
        }
    }

} // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

