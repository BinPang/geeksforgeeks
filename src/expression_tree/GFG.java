package expression_tree;

class GfG {
    public int evalTree(Node root) {
        //Your code here.
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return Integer.parseInt(root.data);
        }
        switch (root.data) {
            case "+":
                return evalTree(root.left) + evalTree(root.right);
            case "-":
                return evalTree(root.left) - evalTree(root.right);
            case "*":
                return evalTree(root.left) * evalTree(root.right);
            case "/":
                return evalTree(root.left) / evalTree(root.right);
        }
        return 0;
    }
}