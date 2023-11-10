package Day3;

import java.util.Scanner;

public class Day3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ret = "";
        String cur = "";
        int i = 0;
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                cur = cur + ch + "";
            }else {
                if (ret.length() < cur.length()) {
                    ret = cur;
                }
                cur = "";
            }
        }
        //处理123abc123456这种情况
        if(i == str.length() && ret.length()< cur.length()) {
            ret = cur;
        }
        System.out.printf(ret);
    }
}
