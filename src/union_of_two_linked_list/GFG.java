package union_of_two_linked_list;

import java.util.SortedSet;
import java.util.TreeSet;

class GFG
{
    Node findUnion(Node head1,Node head2)
    {
        //Add your code here.
        SortedSet<Integer> set = new TreeSet<>();
        while (head1 != null) {
            set.add(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            set.add(head2.data);
            head2 = head2.next;
        }
        Node fakeHead = new Node(0);
        Node prev = fakeHead;
        for (Integer i:set) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        return fakeHead.next;
    }
}
