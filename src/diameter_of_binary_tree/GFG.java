package diameter_of_binary_tree;
//just copy from package:maximum_path_sum

class GfG {
    /* Complete the function to get diameter of a binary tree */
    int diameter(Node node) {
        // Your code here
        if (node == null) {
            return 0;
        }
        Integer[] r = _diameter(node);
        return Math.max(r[0], r[1]);
    }


    Integer[] _diameter(Node node) {
        // Your code here
        if (node == null) {
            return new Integer[]{0, 0};
        }
        if (node.left == null && node.right == null) {
            return new Integer[]{1, 1};
        }
        if (node.left == null) {
            Integer[] r = _diameter(node.right);
            //System.out.println(node.data + "_" + r[0] + "_" + r[1]);
            return new Integer[]{r[0], r[1] + 1};
        } else if (node.right == null) {
            Integer[] l = _diameter(node.left);
            //System.out.println(node.data + "_" + l[0] + "_" + l[1]);
            return new Integer[]{l[0], l[1] + 1};
        } else {
            int zero, one;
            Integer[] l = _diameter(node.left);
            Integer[] r = _diameter(node.right);
            zero = Math.max(Math.max(l[0], r[0]), 1 + l[1] + r[1]);
            one = Math.max(l[1], r[1]) + 1;
//            System.out.println(node.data + "_" + l[0] + "_" + l[1]);
//            System.out.println(node.data + "_" + r[0] + "_" + r[1]);
//            System.out.println(node.data + "_" + zero + "_" + one);
            return new Integer[]{zero, one};
        }
    }
}
