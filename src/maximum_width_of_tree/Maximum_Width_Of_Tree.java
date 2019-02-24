package maximum_width_of_tree;
//https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1

import java.util.HashMap;
import java.util.Scanner;

class Maximum_Width_Of_Tree {
    void inorder(Node node) {
        if (node == null)
            return;
        else
            inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);


    }

    // driver function to test the above functions
    public static void main(String args[]) {
        //Maximum_Width_Of_Trees CLN = new Maximum_Width_Of_Tree();
        //Index index_obj = new Index();
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            HashMap<Integer, Node> m = new HashMap<Integer, Node>();
            int n = sc.nextInt();

            Node root = null;

            while (n > 0) {

                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null) {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }

                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }

            GfG g = new GfG();
            int res = g.getMaxWidth(root);
            System.out.println(res);
            //CLN.inorder(root);
            t--;
            // System.out.println();
        }
    }
}