package smallest_number_subset;
//https://practice.geeksforgeeks.org/problems/smallest-number-subset/0

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
        int max = 1;
        for (int num : arr) {
            if (max >= num) {
                max += num;
            } else {
                break;
            }
        }
        return max;
    }
}