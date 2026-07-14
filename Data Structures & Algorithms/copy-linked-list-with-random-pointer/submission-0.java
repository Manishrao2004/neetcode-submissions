/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        while(temp!=null){
            Node t2= temp.next;
            temp.next=new Node(temp.val);
            temp=temp.next;
            temp.next=t2;
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            Node t2=temp.next;
            if(temp.random!=null)
                t2.random=temp.random.next;
            else
                t2.random=null;
            temp=t2.next;
        }

        Node dummy=new Node(0);

        Node t2=dummy;
        temp=head;
        while(temp!=null){
            t2.next=temp.next;
            t2=t2.next;
            temp.next=t2.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}
