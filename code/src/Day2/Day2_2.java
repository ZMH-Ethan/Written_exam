package Day2;

import java.util.Scanner;

public class Day2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n + 1];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int i = 0;
        int count = 0;
        while (i < n) {
            if(array[i] < array[i+1]) {
                while (array[i] < array[i+1]) {
                    i++;
                }
                count++;
            }else if (array[i] == array[i+1]) {
                i++;
            }else {
                while (i < n && array[i] > array[i+1]) {
                    i++;
                }
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
