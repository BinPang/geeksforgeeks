package armstrong_numbers;
//https://practice.geeksforgeeks.org/problems/armstrong-numbers/0

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
                int num = Integer.parseInt(br.readLine());
                System.out.println(gfg.armstrong(num));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String armstrong( int num) {
        int t ;
        int r = 0;
        int old = num;
        while (true) {
            t = num % 10;
            num = num /10;
            r += t*t*t;
            if (num ==0) {
                if (r == old) {
                    return "Yes";
                } else {
                    return "No";
                }
            }
        }
    }
}
