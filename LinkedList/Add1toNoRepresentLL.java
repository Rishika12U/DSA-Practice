class Solution {
public ListNode reverse(ListNode head){
    ListNode current = head;
    ListNode prev = null;
    ListNode next;

    while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
}

    public ListNode addOne(ListNode head) {
     head = reverse(head);

    int carry = 1;
    ListNode current = head;

    while(current != null &&  carry > 0){
        int sum = current.val + carry;
        current.val = sum % 10;
        carry = sum / 10;

 if(current.next == null && carry > 0 ){
        current.next = new ListNode(carry);
        carry = 0;
    }
    current = current.next;

    }
    head = reverse(head);

    return head;
    }
}
