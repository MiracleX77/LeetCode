
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

class Solution234 {
    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        mid = reverse(mid);
        while (mid != null) {
            if (mid.val != head.val) {
                return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;
    }

    public static ListNode middle(ListNode mid) {
        ListNode fast = mid;
        ListNode slow = mid;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode mid) {
        ListNode prev = null;
        while (mid != null) {
            ListNode next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(isPalindrome(n1));
    }
}