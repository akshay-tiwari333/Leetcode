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
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int c=0;
        int sum=0;
        while(temp1!=null && temp2!=null){
            sum=c;
            
            sum=sum+temp1.val;
            temp1=temp1.next;
            sum=sum+temp2.val;
            temp2=temp2.next;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            c=sum/10;
        }
        while(temp1!=null){
            sum=c;
            sum=sum+temp1.val;
            c=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            sum=c;
            sum=sum+temp2.val;
            c=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            temp2=temp2.next;
        }
        if(c==1){
            temp.next=new ListNode(1);

        }
        return ans.next;
        
    }
}