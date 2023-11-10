package Day9;

import java.util.Scanner;

public class Day9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(med(n,m));
        }
    }
    public static int med(int n,int m) {
        if((n==1&&m>=1)||(m==1&&n>1)) {
            return m+n;
        }
        return med(n-1,m)+med(n,m-1);
    }
}
