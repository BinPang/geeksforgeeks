package number_of_paths;

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
                String[] item = br.readLine().trim().split("\\s+");
                int result = gfg.number(Integer.parseInt(item[0]), Integer.parseInt(item[1]));
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int number(int n1, int n2) {
        int[][] dp = new int[n1][n2];
        for (int i = 0; i < n2; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < n1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n1; i++) {
            for (int j = 1; j < n2; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[n1 - 1][n2 - 1];
    }
}