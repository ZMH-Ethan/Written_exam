package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Day1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            long sum = 0;
            int[] array = new int[3*a];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            Arrays.sort(array); //对数组排序
            for (int i = 0; i < a; i++) {
                sum += array[array.length-2*(i+1)];
            }
            System.out.println(sum);
        }
    }
}