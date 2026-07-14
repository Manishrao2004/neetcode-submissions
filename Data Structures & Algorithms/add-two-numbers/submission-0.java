/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(0);
        ListNode t1=l1,t2=l2;
        ListNode temp=dummy;
        int c=0;

        while(t1!=null || t2!=null || c!=0){
            int v1= t1!=null? t1.val : 0;
            int v2= t2!=null? t2.val : 0;

            int num = v1+v2+c;
            c=num/10;
            num=num%10;

            temp.next = new ListNode(num);
            temp= temp.next;

            t1= t1!=null? t1=t1.next : null;
            t2= t2!=null? t2=t2.next : null;
        }
        return dummy.next;
    }
}
