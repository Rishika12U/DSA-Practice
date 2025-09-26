 class Solution {
     public int findLengthOfLoop(ListNode head) {
ListNode slow = head;
ListNode fast = head;
int cnt = 1;

while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;

    if(slow == fast){
    fast = fast.next;

    while(slow != fast){
        fast = fast.next;
        cnt++;
    }
    return cnt;
    }
}
return 0;
     }
 }
