package Day8;

import java.util.Scanner;

public class Day8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mn = func(m,n);
        System.out.println((m * n) /mn);
    }
    public static int func(int m,int n) {
        if (m == n) {
            return m;
        }
//        if (n > m) {
//            int tmp = m;
//            m = n;
//            n = tmp;
//        }
        int k = 0;
        while ((k = m % n) > 0) {
            m = n;
            n = k;
        }
        return n;
    }
}
