package minimum_element_in_bst;

class GfG {
    int minValue(Node node) {
        if (node == null) {
            return -1;
        }
        Node t = node;
        while (true) {
            if (t.left == null) {
                return t.data;
            }
            t = t.left;
        }
    }
}


class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
