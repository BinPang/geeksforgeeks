package swap_two_nibbles_in_a_byte;
//https://practice.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte/0

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
                int a = Integer.parseInt(br.readLine());
                int b = gfg.newValue(a);
                System.out.println(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int newValue(int value) {
        int a = value & 0x0F;
        int b = (value & 0xF0)>>4;
        return (a<<4)+b;
    }
}
