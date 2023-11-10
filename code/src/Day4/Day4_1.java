package Day4;

import java.util.*;
public class Day4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int A = (a+c)/2;
        int C = (d-b)/2;
        int B1 = (b+d)/2;
        int B2 = (c-a)/2;

        if (B1 != B2) {
            System.out.println("No");
        }else {
            System.out.println(A + " " + B2 + " " + C);
        }
    }
}
