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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        ListNode prev=head;
        ListNode curr=head.next;
        int idx=1;
        int firsti=-1;
        int lasti=-1;
        int mind=Integer.MAX_VALUE;
        while(curr.next!=null){
            ListNode next=curr.next;
            boolean ismax=curr.val > prev.val && curr.val > next.val;
            boolean ismin=curr.val < prev.val && curr.val < next.val;
            if(ismax || ismin){
                if(lasti==-1) firsti=idx;
                else mind=Math.min(mind,idx-lasti);
                lasti=idx;
            }
            prev=curr;
            curr=next;
            idx++;
        }
        if( firsti==lasti) return new int[]{-1,-1};
        int maxd=lasti-firsti;
        return new int[]{mind,maxd};
    }
}