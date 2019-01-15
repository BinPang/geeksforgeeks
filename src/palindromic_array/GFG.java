package palindromic_array;
//https://practice.geeksforgeeks.org/problems/palindromic-array/0

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
                int step = gfg.deal(list);
                System.out.println(step);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int deal(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int step = 0;
        while (true) {
            if (start >= end) {
                break;
            }
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else if (arr[start] > arr[end]) {
                step++;
                arr[end - 1] = arr[end - 1] + arr[end];
                end--;
            } else {
                step++;
                arr[start + 1] = arr[start] + arr[start + 1];
                start++;
            }
        }
        return step;
    }
}
