package maximum_money;
//https://practice.geeksforgeeks.org/problems/maximum-money/0

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
                String item = br.readLine().trim();
                int[] list = new int[2];
                int i = 0;
                for (String s : item.split("\\s+")) {
                    list[i] = Integer.parseInt(s);
                    i++;
                }
                int step = gfg.max(list[0], list[1]);
                System.out.println(step);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int max(int a, int b) {
        int times = a / 2;
        if (a % 2 == 1) {
            times += 1;
        }
        return times * b;
    }
}