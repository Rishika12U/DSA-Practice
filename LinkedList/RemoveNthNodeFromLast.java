class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int cnt = 0;

     if(head == null){
        return null;
     }

        while(temp != null){
       temp = temp.next;
       cnt++;
        }

        int idx = cnt-n;
        int i = 0;
        temp = head;
 
    if(cnt == n){
        ListNode newHead = head.next;
        head.next = null;
        head = newHead;
        return head;
    }

        while(i< idx-1){
        temp = temp.next;
        i++;
        }
    temp.next = temp.next.next;
    return head;
    }
}
