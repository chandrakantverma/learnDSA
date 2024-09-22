package example.leetcode75;

import example.mediumproblems.leetcode.ListNode;

public class MaxTwinSumLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(pairSum(head));
    }
    public static int pairSum(ListNode head) {
        if(head==null) return 0;
        if(head.next.next==null)  return head.val+head.next.val;

        ListNode midpointer = getMid(head);
        ListNode reversePointer = reverseList(midpointer);

        ListNode temp1 = head;
        ListNode temp2 = reversePointer;
        int maxSum = 0;
        while(temp2!=null){
            maxSum = Math.max(temp1.val+ temp2.val,maxSum);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return maxSum;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode fwd;
        ListNode curr = head;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    private static ListNode getMid(ListNode head) {
        ListNode slow = head,fast = head;

        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast =  fast.next.next;
        }
        return slow;
    }
}


