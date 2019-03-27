package symmetric_tree;

class GfG {
    public static boolean isSymmetric(Node root) {
        // add your code here;
        if (root == null) {
            return true;
        }
        return _isSymmetric(root.left, root.right);
    }

    private static boolean _isSymmetric(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.data == right.data && _isSymmetric(left.left, right.right) && _isSymmetric(left.right, right.left);
    }
}
