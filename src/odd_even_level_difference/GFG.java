package odd_even_level_difference;

class GfG {   /*You are required to complete this function*/
    int getLevelDiff(Node root) {
        // Your code here
        return _getLevelDiff(root, true);
    }

    int _getLevelDiff(Node root, Boolean odd) {
        if (root == null) {
            return 0;
        }
        return _getLevelDiff(root.left, !odd) + (odd ? root.data : -root.data) + _getLevelDiff(root.right, !odd);
    }
}
