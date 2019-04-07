import java.io.BufferedReader;
import java.io.InputStreamReader;

class GFG0 {
    public static void main(String[] args) {
        //code
        GFG0 gfg = new GFG0();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int number = Integer.parseInt(br.readLine());
                gfg.work(number);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void work(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 14; i++) {
            if ((number & 1) == 1) {
                sb.insert(0, "1");
            } else {
                sb.insert(0, "0");
            }
            number = number >> 1;
        }
        System.out.println(sb);
    }
}