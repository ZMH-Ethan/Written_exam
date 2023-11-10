package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Day2_1 {
    public static  void reverse(char[] array,int start,int end) {
        while (start < end) {
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //字符串转数组
        char[] ch = s.toCharArray();
        int len = ch.length;
        reverse(ch,0,len-1);
        int i = 0;
        while (i < len) {
            int j = i;
            while (j < len && ch[j] != ' ') {
                j++;
            }
            if(j < len) {
                reverse(ch,i,j-1);
                i = j + 1;
            }else {
                reverse(ch,i,j-1);
                i = j;
            }
        }
        String outstr = new String(ch);
        System.out.println(ch);
    }
}
