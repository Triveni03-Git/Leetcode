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
    public ListNode mergeNodes(ListNode head) {

        // ListNode ans=new ListNode();
        // int sum=0;
        ListNode t1=head;
        ListNode t2=head;
        ListNode ans=new ListNode();
        ListNode t=ans;
        while(t1!=null){
            int sum=0;

            while(t2.val!=0){
                sum=sum+t2.val;
                t2=t2.next;

            }
            System.out.println(sum);
            ListNode temp=new ListNode(sum);
            t.next=temp;
            t=t.next;
            t2=t2.next;
            t1=t2;
            sum=0;
        }
        return ans.next.next;
    }
}