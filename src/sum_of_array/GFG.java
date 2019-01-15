package sum_of_array;
//https://practice.geeksforgeeks.org/problems/sum-of-array/0

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
                gfg.arraySum(item.split("\\s+"), size);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void arraySum(String[] items, int size) {
        int total = 0;
        for (int j = 0; j < size; j++) {
            total += Integer.parseInt(items[j]);
        }
        System.out.println(total);
    }
}