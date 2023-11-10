package Day8;

import java.util.Scanner;

public class Day8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = scanner.next();
            }
            boolean len = isLensort(str);
            boolean dic = isDicsort(str);

            if(len && dic) {
                System.out.println("both");
            } else if (len) {
                System.out.println("lengths");
            } else if (dic) {
                System.out.println("lexicographically");
            }else {
                System.out.println("none");
            }
        }
    }
    public static boolean isLensort(String[] str) {
        for (int i = 0; i < str.length-1; i++) {
            if(str[i].length() > str[i+1].length()) {
                return false;
            }
        }
        return true;
    }
    public static boolean isDicsort(String[] str) {
        for (int i = 0; i < str.length-1; i++) {
            if (str[i].compareTo(str[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }
}
