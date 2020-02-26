

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode kNode = findKNode(head, k);
        if (kNode != null) {
            ListNode kPlus1Node = kNode.next;
            kNode.next = null;
            reverseBetween(head, kNode);
            if (kPlus1Node != null) {
                head.next = reverseKGroup(kPlus1Node, k);
            }
            return kNode;
        } else {
            return head;
        }
    }

    private void reverseBetween(ListNode head, ListNode kNode) {
        ListNode prev = head;
        ListNode pCur = head.next;
        while (pCur != null) {
            prev.next = pCur.next;
            pCur.next = head;
            head = pCur;
            pCur = prev.next;
         }

    }

    private ListNode findKNode(ListNode head, int k) {
        for (int i = 1; i < k; i++) {
            if (head != null) {
                head = head.next;
            } else {
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = five;
        Solution solution = new Solution();
        head = solution.reverseKGroup(head, 6);
        printList(head);
    }

    private static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + (head.next != null ? "->" : ""));
            head = head.next;
        }
    }
}
