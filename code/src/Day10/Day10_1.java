package Day10;

public class Day10_1 {
    public boolean checkWon(int[][] board) {
        // write code here
        int length = board.length;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < length; i++) {
            //每次到这里都是新的一行
            sum1 = 0;
            sum2 = 0;
            sum3 += board[i][i];
            sum4 += board[i][length-i-1];
            for (int j = 0; j < length; j++) {
                sum1 += board[i][j];
                sum2 += board[j][i];
            }
            if (sum1 == length || sum2 == length || sum3 == length || sum4 == length) {
                return true;
            }
        }
        return false;
    }
}
