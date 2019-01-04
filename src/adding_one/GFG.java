package adding_one;

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
                gfg.plusOne(item.split("\\s+"), size);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void plusOne(String[] items, int size) {
        int[] arr = new int[size];
        int plus = 1;
        int sum;
        for (int j = size - 1; j >= 0; j--) {
            sum = plus + Integer.parseInt(items[j]);
            if (sum == 10) {
                plus = 1;
                sum -= 10;
            } else {
                plus = 0;
            }
            arr[j] = sum;
        }

        StringBuilder sb = new StringBuilder();
        if (plus == 1) {
            sb.append("1 ");
        }
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}