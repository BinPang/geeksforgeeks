package k_largest_elements;
//https://practice.geeksforgeeks.org/problems/k-largest-elements/0

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

class GFG {
    public static void main(String[] args) {
        //code
        GFG gfg = new GFG();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                String item0 = br.readLine().trim();
                int size = Integer.parseInt(item0.split("\\s+")[1]);
                String item = br.readLine().trim();
                Integer[] r = gfg.maxN(item.split("\\s+"), size);
                StringBuilder sb = new StringBuilder();
                for (Integer oneR : r) {
                    sb.append(oneR);
                    sb.append(" ");
                }
                System.out.println(sb);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private Integer[] maxN(String[] items, int size) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(size, Collections.reverseOrder()); //here can optimize
        for (String item : items) {
            int iItem = Integer.parseInt(item);
            pQueue.add(iItem); //here can optimize
        }
        Integer[] r = new Integer[size];
        for (int i = 0; i < size; i++) {
            r[i] = pQueue.poll();
        }
        return r;
    }
}
