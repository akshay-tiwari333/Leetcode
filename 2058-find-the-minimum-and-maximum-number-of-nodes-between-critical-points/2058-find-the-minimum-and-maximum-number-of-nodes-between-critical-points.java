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
        ListNode curr=head.next;
        ListNode prev=head;
        int i=1;
        
        int fcp=-1;
        int pcp=0;
        int min=Integer.MAX_VALUE;
        while(curr.next!=null){
            if((curr.val>prev.val && curr.val>curr.next.val)|| (curr.val<prev.val && curr.val<curr.next.val)){
               if(fcp==-1){
                fcp=i;
               }
               else{
                 min=Math.min(min,i-pcp);

               }
               pcp=i;
            }
           
                prev=prev.next;
                curr=curr.next;
                i++;
               
            

        }
        int max=pcp-fcp;
        if(min==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{min,max};

       
        
    }
}