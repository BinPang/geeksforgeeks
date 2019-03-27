package expression_tree;
//https://practice.geeksforgeeks.org/problems/expression-tree/1

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ExpressionTree {
    static Node root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++)
                s[i] = sc.next();
            GfG g = new GfG();

            root = null;
            makeTree(s, n);
            System.out.println(g.evalTree(root));
        }
    }

    public static void makeTree(String[] s, int n) {
        Queue<Node> queue = new LinkedList<Node>();
        root = new Node(s[0]);
        queue.add(root);
        int p = 1;
        try {
            while (n > 0) {
                Node proot = queue.poll();
                proot.left = new Node(s[p]);
                queue.add(proot.left);
                p++;
                n--;
                if (n > 0) {
                    proot.right = new Node(s[p]);
                    queue.add(proot.right);
                    p++;
                    n--;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
        }
    }
}