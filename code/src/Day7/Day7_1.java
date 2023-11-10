package Day7;

import java.util.Scanner;

public class Day7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        while (f2 < n) {
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        int min = Math.min(n-f1,f2-n);
        System.out.println(min);
    }
}
