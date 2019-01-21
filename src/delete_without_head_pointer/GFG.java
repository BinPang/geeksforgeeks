package delete_without_head_pointer;

// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
class GfG {
    void deleteNode(Node del) {
        // Your code here
        while (true) {
            if (del.next.next != null) {
                del.data = del.next.data;
                del = del.next;
            } else {
                del.data = del.next.data;
                del.next = null;
                break;
            }
        }
    }
}