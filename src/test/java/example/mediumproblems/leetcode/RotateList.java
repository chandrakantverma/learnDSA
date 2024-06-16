package example.mediumproblems.leetcode;


import org.junit.jupiter.api.Test;

public class RotateList {

    @Test
    public void testRotateList(){
        ListNode temp = null;
        ListNode head = new ListNode(1);
        temp = head;
        int i =2;
        while(i<6){
            temp.next  = new ListNode(i++);
            temp = temp.next;
        }
        ListNode result = rotateRight(head,6);
        System.out.println(result);
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode nthFromLast = getNthFromLast(head,k);
        ListNode last = getLast(head);
        last.next = head;
        head = nthFromLast.next;
        nthFromLast.next = null;
        return head;
    }

    private ListNode getLast(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp;
    }

    public ListNode getNthFromLast(ListNode head, int n){
        ListNode fwd = head, curr = head;
        for(int i =1;i<=n;i++){
            fwd = fwd.next;
        }
        while(fwd.next!=null){
            curr = curr.next;
            fwd = fwd.next;
        }
        return curr;
    }
}
