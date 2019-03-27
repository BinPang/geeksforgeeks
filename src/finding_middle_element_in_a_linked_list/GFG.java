package finding_middle_element_in_a_linked_list;

class GFG {
    // Function to find middle element a linked list
    int getMiddle(Node head) {
        // Your code here.
        if (head == null) {
            return 0;
        }
        Node step1 = head;
        Node step2 = head;
        while (true) {
            if (step2.next == null) {
                return step1.data;
            }
            if (step2.next.next == null) {
                return step1.next.data;
            }
            step1 = step1.next;
            step2 = step2.next.next;
        }
    }
}
