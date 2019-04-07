import java.util.HashMap;

//some easy problem, don't comment code, it's so easy
public class GFG {

    public static int findMax(Height arr[], int n) {
        // your code here
        int r = 0;
        int tmp = 0;
        for (Height height : arr) {
            tmp = height.feet * 12 + height.inches;
            if (tmp > r) {
                r = tmp;
            }
        }
        return r;
    }

    Node Delete(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node prev = head;
        Node p1 = head;
        Node p2 = head;
        while (true) {
            if (p2.next == null) {
                prev.next = p1.next;
                break;
            }
            if (p2.next.next == null) {
                prev = p1;
                prev.next = p1.next.next;
                break;
            }
            prev = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return head;
    }

    Node removeDuplicates(Node head)
    {
        // Your code here
        if (head == null || head.next == null) {
            return head;
        }
        HashMap<Integer, Boolean> m = new HashMap<>();
        m.put(head.data, true);
        Node prev = head;
        Node now = head.next;
        while (now != null) {
            if (m.getOrDefault(now.data, false)) {
                prev.next = now.next;
                now = now.next;
            } else {
                m.put(now.data, true);
                prev = now;
                now = now.next;
            }
        }
        return head;
    }
}


class Height {
    int feet;
    int inches;

    public Height(int ft, int inc) {
        feet = ft;
        inches = inc;
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}