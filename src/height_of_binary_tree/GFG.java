package height_of_binary_tree;

class GfG {
    int height(Node node) {
        // Your code here
        if (node == null) {
            return 0;
        }
        if (node.left != null && node.right != null) {
            return 1 + Math.max(height(node.left), height(node.right));
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        if (node.left != null) {
            return 1 + height(node.left);
        }
        return 1 + height(node.right);
    }
}
