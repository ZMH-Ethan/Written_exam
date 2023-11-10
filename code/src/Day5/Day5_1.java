package Day5;

import java.util.Scanner;

public class Day5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int length = str1.length();
        int count = 0;  //统计插入后是回文结构的个数
        for (int i = 0; i <= length; i++) {
            StringBuffer str = new StringBuffer(str1);  //创建新的字符串str,防止后面的操作修改了str1本身的内容
            str.insert(i,str2);  //将字符串2插入到str中去
            //下面插入后判断是否为回文结构
            //判断的方法是逆置这个字符串然后与原字符串对比
            StringBuffer strCopy = new StringBuffer(str);   //注意这里不能直接overStr = str.reverse():这样str的值就又变了
            StringBuffer overStr = strCopy.reverse();

            if (str.toString().equals(overStr.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
