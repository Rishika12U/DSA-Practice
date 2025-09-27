class Solution {
    public ListNode sortList(ListNode head) {
      ListNode zeroHead = new ListNode(-1), zeroTail = zeroHead;
      ListNode oneHead = new ListNode(-1), oneTail = oneHead;
      ListNode twoHead = new ListNode(-1), twoTail = twoHead;

      ListNode curr = head;
      if(head == null || head.next == null){
        return head;
      }

      while(curr != null){
        if(curr.val == 0){
            zeroTail.next = curr;
            zeroTail = zeroTail.next;
        }
        else if(curr.val == 1){
            oneTail.next = curr;
            oneTail = oneTail.next;
        }else{
            twoTail.next = curr;
            twoTail = twoTail.next;
        }
        curr = curr.next;
      }

      zeroTail.next = oneHead.next != null ? oneHead.next : twoHead.next;
      oneTail.next = twoHead.next;
      twoTail.next = null;

      return zeroHead.next;
    }
}
