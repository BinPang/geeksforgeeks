package symmetric_tree;

import java.util.HashMap;
import java.util.Scanner;

class Symmetric_Tree {
    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node child;
        int t = sc.nextInt();

        while (t-- > 0) {
            int N1 = sc.nextInt();
            int N2 = sc.nextInt();
            Node root1 = null;
            Node root2 = null;
            Node root = null;

            HashMap<Integer, Node> hm = new HashMap<Integer, Node>();

            for (int i = 0; i < N1; i++) {
                Node parent = null;
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char c = sc.next().charAt(0);
                if (hm.containsKey(n1) == false) {
                    parent = new Node(n1);
                    hm.put(n1, parent);
                    if (root1 == null)
                        root1 = parent;
                } else
                    parent = hm.get(n1);
                child = new Node(n2);
                if (c == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                hm.put(n2, child);
            }
            hm.clear();

            for (int i = 0; i < N2; i++) {
                Node parent = null;
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char c = sc.next().charAt(0);
                if (hm.containsKey(n1) == false) {
                    parent = new Node(n1);
                    hm.put(n1, parent);
                    if (root2 == null)
                        root2 = parent;
                } else
                    parent = hm.get(n1);
                child = new Node(n2);
                if (c == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                hm.put(n2, child);
            }
            int N = sc.nextInt();
            root = new Node(N);
            root.left = root1;
            root.right = root2;

            GfG gfg = new GfG();
            if (gfg.isSymmetric(root) == true)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

}
