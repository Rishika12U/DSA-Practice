## BRUTE FORCE---
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


## OPTIMAL APPROACH---

    class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode slow = head;
    ListNode fast = head;

    for(int i=0; i<n; i++){
        fast = fast.next;
    }

    if(fast == null){
        return head.next;
    }
    while(fast.next != null){
        slow = slow.next;
        fast = fast.next;
    }

slow.next = slow.next.next;
return head;

    }
}
