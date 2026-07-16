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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<=1)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=prev.next;

        while(true){
            int count = 0;
            ListNode node = curr;
            while(node!=null && count !=k){
                node=node.next;
                count++;
            }
            if (k!=count)
                break;
            
            for(int i=0;i<k-1;i++){
                ListNode temp=curr.next;
                curr.next=temp.next;
                temp.next=prev.next;
                prev.next=temp;
            }

            prev=curr;
            curr=prev.next;
        }
        return dummy.next;
    }
}
