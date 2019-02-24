package maximum_width_of_tree;

import java.util.ArrayList;

class GfG {
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root) {
        // Your code here
        if (root == null) {
            return 0;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        _getMaxWidth(root, 0, arr);
        int r = arr.get(0);

        for (Integer i : arr) {
            if (r < i) {
                r = i;
            }
        }
        return r;
    }

    void _getMaxWidth(Node root, int height, ArrayList<Integer> arr) {
        if (height == arr.size()) {
            arr.add(1);
        } else {
            arr.set(height, arr.get(height) + 1);
        }
        if (root.left != null) {
            _getMaxWidth(root.left, height + 1, arr);
        }
        if (root.right != null) {
            _getMaxWidth(root.right, height + 1, arr);
        }
    }
}