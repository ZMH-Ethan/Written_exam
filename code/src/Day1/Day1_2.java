package Day1;

import java.util.HashMap;
import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        //遍历第二个字符串
        for (int i = 0; i < str2.length(); i++) {
            //判断这个字符有没有放到过map中
            if (map.get(str2.charAt(i)) == null) { //没放过
                map.put(str2.charAt(i),1);
            }else {  //放过
                map.put(str2.charAt(i),map.get(str2.charAt(i)) + 1);
            }
        }
        String ret = "";
        //遍历第一个字符串
        for (int i = 0; i < str1.length(); i++) {
            if (map.get(str1.charAt(i)) == null) {
                ret += str1.charAt(i);
            }
        }
        System.out.println(ret);
    }
}