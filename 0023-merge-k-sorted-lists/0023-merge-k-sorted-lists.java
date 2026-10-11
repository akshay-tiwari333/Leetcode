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
    public ListNode mergeKLists(ListNode[] lists) {
      List<Integer> ans=new LinkedList<>();
      for(int i=0;i<lists.length;i++){
        ListNode temp=lists[i];
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
      }
      Collections.sort(ans);
      ListNode list=new ListNode(100);
      ListNode head=list;
      for(int i : ans){
        head.next=new ListNode(i);
        head=head.next;

      }
      System.out.print(ans);
      return list.next;
        
    }
}