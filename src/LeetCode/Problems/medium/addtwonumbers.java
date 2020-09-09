package LeetCode.Problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class addtwonumbers {

    public static void main(String[] arg0){
       /* addTwoNumbers(
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
        );*/
       addTwoNumbers(new ListNode(2, new ListNode(4 , new ListNode(3))),new ListNode(5, new ListNode(6 , new ListNode(4))));
    }

    static ListNode linkedRes;

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode response= new ListNode(0);
        ListNode pivot=response;
        Queue<Integer> resp = new LinkedList<Integer>();
        int sum=0,rest=0;
        while (l1 != null|| l2 != null){
            if(l1!=null&&l2!=null){
                sum=l1.val+l2.val+rest;
                l1=l1.next;
                l2=l2.next;
            }else if(l1==null){
                sum=l2.val+rest;
                l2=l2.next;
            }else if(l2==null){
                sum=l1.val+rest;
                l1=l1.next;
            }
            rest=0;
            if(sum>9){
                rest= sum/10;
                sum= sum%10;
            }
            pivot.next= new ListNode(sum);
            pivot= pivot.next;

        }
        if (rest>0){
            pivot.next= new ListNode(rest);

        }
        return response.next;
    }

} // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

