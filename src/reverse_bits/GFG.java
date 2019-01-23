package reverse_bits;
//https://practice.geeksforgeeks.org/problems/reverse-bits/0

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
                int num = Integer.parseUnsignedInt(br.readLine());
                int r = gfg.reverse(num);
                System.out.println(Integer.toUnsignedString(r));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int reverse(int num) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
            r = (r << 1) + (num & 1);
            num >>= 1;
        }
        return r;
    }
}
