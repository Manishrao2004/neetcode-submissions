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
    public void reorderList(ListNode head) {
        if(head==null)
            return ;
        
        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr=slow.next,prev=null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        slow.next=null;

        ListNode dummy= new ListNode(0);
        ListNode t=dummy;
        ListNode t1=head;
        ListNode t2=prev;

        while(t1!=null && t2!=null){
            t.next=t1;
            t1=t1.next;
            t=t.next;

            t.next=t2;
            t2=t2.next;
            t=t.next;
        }
        while(t1!=null){
                t.next=t1;
                t1=t1.next;
                t=t.next;
            }

            while(t2!=null){
                t.next=t2;
                t2=t2.next;
                t=t.next;
            }
            head=dummy.next;
    }
}
