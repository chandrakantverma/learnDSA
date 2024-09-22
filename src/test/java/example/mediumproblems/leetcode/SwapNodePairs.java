package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Test;

public class SwapNodePairs {


    @Test
    public void testSwapNodes(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        printList(swapPairs(listNode));
    }

    private void printList(ListNode swapPairs) {
        ListNode temp = swapPairs;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;

        ListNode curr = head, next = curr.next;
        ListNode temp = next;
        while(curr!=null&&curr.next!=null){
            curr.next = next.next;
            next.next = curr;
            next = curr.next;
            printList(temp);
        }
        return temp;

    }
}
