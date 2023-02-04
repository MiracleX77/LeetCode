
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution1290 {
    public static int getDecimalValue(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 2 + head.val;
            head = head.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(0);
        ListNode node7 = new ListNode(1);
        ListNode node8 = new ListNode(1);
        ListNode node9 = new ListNode(1);
        ListNode node10 = new ListNode(0);
        ListNode node11 = new ListNode(0);
        ListNode node12 = new ListNode(0);
        ListNode node13 = new ListNode(0);
        ListNode node14 = new ListNode(0);
        ListNode node15 = new ListNode(0);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        System.out.println(getDecimalValue(node1));

    }
}