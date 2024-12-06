package AddTwoNumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Iterator l1 and l2
        ListNode p = l1;
        ListNode q = l2;
        // Dummy node
        ListNode dummyHead = new ListNode(0);
        // Current node
        ListNode current = dummyHead;
        // Carry
        int carry = 0;
        // Iterate through l1 and l2
        while (p != null || q != null) {
            // Get the value of p and q
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            // Sum of x, y, and carry
            int sum = carry + x + y;
            // Update carry
            carry = sum / 10;
            // Update current node
            current.next = new ListNode(sum % 10);
            current = current.next;
            // Update p and q
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        // Check if carry is greater than 0
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        // Return dummyHead.next
        return dummyHead.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result);
    }

}

// 9 9 9 9 9 9 9
// 9 9 9 9
// 8 9 9 9 0 0 0 1
// 8 9 9 9 0 0 0 1