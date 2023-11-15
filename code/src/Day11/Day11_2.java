package Day11;

import java.util.Scanner;

public class Day11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            int nowCount = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    nowCount++;
                    count = Math.max(count, nowCount);
                } else {
                    nowCount = 0;
                }
                n >>= 1;
            }
            System.out.println(count);
        }
    }
}
