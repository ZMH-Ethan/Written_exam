package Day4;

import java.util.Scanner;

public class Day4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        StringBuilder s = new StringBuilder();
        String table = "0123456789ABCDEF";
        boolean flg = false; //是否变过号

        if (m < 0) {
            m = -m;
            flg = true;
        }
        while (m != 0) {
            s .append(table.charAt(m % n));
            m = m / n;
        }
        if (flg) {
            s.append("-");
        }
        s.reverse();
        System.out.println(s);
    }
}
