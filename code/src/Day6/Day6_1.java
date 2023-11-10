package Day6;

import java.util.Scanner;

public class Day6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt(); //行
        int col = scanner.nextInt(); //列
        int count = 0;  //计数
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(array[i][j] == 0) {
                    count++;
                    if(i+2 < row) {
                        array[i+2][j] = 1;
                    }
                    if(j+2 < col) {
                        array[i][j+2] = 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
