package union_of_two_arrays;
//https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class GFG {
    public static void main(String[] args) {
        //code
        GFG gfg = new GFG();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                String s0 = br.readLine();
                String[] as0 = s0.split("\\s+");
                int n1 = Integer.parseInt(as0[0]);
                int n2 = Integer.parseInt(as0[1]);

                String s1 = br.readLine().trim();
                String s2 = br.readLine().trim();
                int[] a1 = new int[n1];
                int[] a2 = new int[n2];
                int i = 0;
                for (String s : s1.split("\\s+")) {
                    a1[i] = Integer.parseInt(s);
                    i++;
                }
                i = 0;
                for (String s : s2.split("\\s+")) {
                    a2[i] = Integer.parseInt(s);
                    i++;
                }
                String u = gfg.union(a1, a2);
                System.out.println(u);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String union(int[] a1, int[] a2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> r = new ArrayList<>();
        for (int item : a1) {
            if (!set.contains(item)) {
                r.add(item);
                set.add(item);
            }
        }
        for (int item : a2) {
            if (!set.contains(item)) {
                r.add(item);
                set.add(item);
            }
        }
        Collections.sort(r);
        StringBuilder sb = new StringBuilder();
        for (int item : r) {
            sb.append(item);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}