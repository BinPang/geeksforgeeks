package reverse_each_word_in_a_given_string;
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
                String result = gfg.reverse(item);
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String reverse(String item) {
        String[] v = item.split("\\.");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]+"_" + v.length);
            byte[] tmp = v[i].getBytes();
            int start = 0;
            int end = tmp.length - 1;
            while (start < end) {
                byte t0 = tmp[start];
                tmp[start] = tmp[end];
                tmp[end] = t0;
                start++;
                end--;
            }
            v[i] = new String(tmp);
        }

        return String.join(".", v);
    }
}