package remove_character;
//https://practice.geeksforgeeks.org/problems/remove-character/0

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

class GFG {
    public static void main(String[] args) {
        //code
        GFG gfg = new GFG();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                String s1 = br.readLine().trim();
                String s2 = br.readLine().trim();
                String r = gfg.remove(s1, s2);
                System.out.println(r);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String remove(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for (char b : s2.toCharArray()) {
            set.add(b);
        }
        StringBuilder sb = new StringBuilder();
        for (char b : s1.toCharArray()) {
            if (!set.contains(b)) {
                sb.append(b);
            }
        }
        return sb.toString();
    }
}