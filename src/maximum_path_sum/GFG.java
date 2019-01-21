package maximum_path_sum;

class GfG {
    public static int maxPathSum(Node root) {
        //print(root);
        // your code here
        if (root == null) {
            return 0;
        }
        Integer[] r = _maxPathSum(root);
        return Math.max(r[0], r[1]);
    }

    public static void print(Node node) {
        if (node != null) {
            if (node.left != null) {
                print(node.left);
            }
            System.out.println(node.data);
            if (node.right != null) {
                print(node.right);
            }
        }
    }

    //item zero is part max value; item one is max from node
    public static Integer[] _maxPathSum(Node node) {
        if (node == null) {
            return new Integer[]{0, 0};
        }
        if (node.left == null && node.right == null) {
            return new Integer[]{node.data, node.data};
        }
        if (node.left == null) {
            Integer[] r = _maxPathSum(node.right);
            //System.out.println(node.data + "_" + r[0] + "_" + r[1]);
            return new Integer[]{r[0], r[1] + node.data};
        } else if (node.right == null) {
            Integer[] l = _maxPathSum(node.left);
            //System.out.println(node.data + "_" + l[0] + "_" + l[1]);
            return new Integer[]{l[0], l[1] + node.data};
        } else {
            int zero, one;
            Integer[] l = _maxPathSum(node.left);
            Integer[] r = _maxPathSum(node.right);
            zero = Math.max(Math.max(l[0], r[0]), node.data + l[1] + r[1]);
            one = Math.max(l[1], r[1]) + node.data;
//            System.out.println(node.data + "_" + l[0] + "_" + l[1]);
//            System.out.println(node.data + "_" + r[0] + "_" + r[1]);
//            System.out.println(node.data + "_" + zero + "_" + one);
            return new Integer[]{zero, one};
        }
    }
}
