package problems;

public class ListNodeProblems {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if (l2 != null && l1 == null) {
            return l2;
        }

        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode merged = null;
        ListNode curr3 = null;

        if (curr1.val < curr2.val) {
            merged = new ListNode(curr1.val, null);
            curr1 = curr1.next;
            curr3 = merged;
        } else if (curr2.val < curr1.val) {
            merged = new ListNode(curr2.val, null);
            curr2 = curr2.next;
            curr3 = merged;
        } else {
            merged = new ListNode(curr1.val, new ListNode(curr2.val, null));
            curr1 = curr1.next;
            curr2 = curr2.next;
            curr3 = merged.next;
        }

        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                curr3.next = new ListNode(curr1.val, null);
                curr1 = curr1.next;
                curr3 = curr3.next;
            } else if (curr2.val < curr1.val) {
                curr3.next = new ListNode(curr2.val, null);
                curr2 = curr2.next;
                curr3 = curr3.next;
            } else {
                curr3.next = new ListNode(curr1.val, new ListNode(curr2.val, null));
                curr1 = curr1.next;
                curr2 = curr2.next;
                curr3 = curr3.next.next;
            }
        }

        while (curr1 != null) {
            curr3.next = new ListNode(curr1.val, null);
            curr1 = curr1.next;
            curr3 = curr3.next;
        }

        while (curr2 != null) {
            curr3.next = new ListNode(curr2.val, null);
            curr2 = curr2.next;
            curr3 = curr3.next;
        }

        return merged;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head.next;
        ListNode prev = head;

        while (curr != null) {
            if (curr.val == prev.val) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        ListNode curr2 = headB;

        while (curr1 != null) {
            while (curr2 != null) {
                if (curr1 == curr2) {
                    return curr1;
                }
                curr2 = curr2.next;
            }
            curr1 = curr1.next;
        }
        return null;
    }
}
