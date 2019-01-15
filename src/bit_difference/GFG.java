package bit_difference;
//https://practice.geeksforgeeks.org/problems/bit-difference/0

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
                String[] sItem = item.split("\\s+");
                int a = Integer.parseInt(sItem[0]);
                int b = Integer.parseInt(sItem[1]);
                int c = gfg.count(a, b);
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int count(int a, int b) {
        int r = 0;
        while (true) {
            if (a == 0 && b == 0) {
                break;
            }
            if (((a & 1) ^ (b & 1)) == 1) {
                r++;
            }
            a = a >> 1;
            b = b >> 1;
        }
        return r;
    }
}
