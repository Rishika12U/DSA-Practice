class Solution {
public ListNode findMid(ListNode head){
    ListNode slow = head;
    ListNode fast = head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

public ListNode merge(ListNode head1, ListNode head2){
    ListNode newHead = new ListNode(-1);
    ListNode temp = newHead;

    while(head1 != null && head2 != null){
        if(head1.val <= head2.val){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    while(head1 != null){
         temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
    }
    while(head2 != null){
        temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
    }
    return newHead.next;
}

    public ListNode sortList(ListNode head) {
        //Base case
        if(head == null || head.next== null){
            return head;
        }
        //find mid
        ListNode Mid = findMid(head);

        //Divide left & right
        ListNode right = Mid.next;
        Mid.next = null;
        ListNode left = head;

      ListNode leftHead = sortList(left);
      ListNode rightHead = sortList(right);

      return merge(leftHead, rightHead);
    }
}
