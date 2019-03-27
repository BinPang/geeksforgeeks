package non_repeating_character;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class GFG {
    public static void main(String[] args) {
        //code
        GFG gfg = new GFG();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int size = Integer.parseInt(br.readLine().trim());
                String item = br.readLine().trim();
                String result = gfg.nrc(item, size);
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String nrc(String item, int size) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {

            map.put(item.charAt(i), map.getOrDefault(item.charAt(i), 0) + 1);
        }

        for (int i = 0; i < size; i++) {
            if (map.get(item.charAt(i)) == 1) {
                return "" + item.charAt(i);
            }
        }
        return "-1";

    }
}
