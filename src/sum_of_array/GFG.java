package sum_of_array;

/*package whatever //do not write package name here */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int size = sc.nextInt();
            sc.nextLine();
            String item = sc.nextLine();
            String[] items = item.split(" ");
            int total = 0;
            for (int j = 0; j < size; j++) {
                total += Integer.parseInt(items[j]);
            }
            System.out.println(total);
        }
    }
}