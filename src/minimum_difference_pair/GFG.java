package minimum_difference_pair;
//https://practice.geeksforgeeks.org/problems/minimum-difference-pair/0

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class GFG {
    public static void main(String[] args) {
        //code
        GFG gfg = new GFG();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int size = Integer.parseInt(br.readLine());
                String item = br.readLine().trim();
                int[] list = new int[size];
                int i = 0;
                for (String s : item.split("\\s+")) {
                    list[i] = Integer.parseInt(s);
                    i++;
                }
                int step = gfg.min(list);
                System.out.println(step);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int min(int[] arr) {
        Arrays.sort(arr);
        int m = arr[1] - arr[0];// length gte 2, so we can do it
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] < m) {
                m = arr[i] - arr[i - 1];
            }
        }
        return m;
    }
}
