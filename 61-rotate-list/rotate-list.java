class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Base case: empty list, single node, or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head; 
        }
        tail.next = head;
        int stepsToNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}