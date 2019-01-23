package k_distance_from_root;

class GfG {
    // Recursive function to print right view of a binary tree.
    void printKdistance(Node root, int k) {
        // Your code here
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
        } else if (k > 0) {
            printKdistance(root.left, k - 1);
            printKdistance(root.right, k - 1);
        }
    }
}
