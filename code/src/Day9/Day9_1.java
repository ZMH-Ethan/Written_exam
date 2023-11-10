package Day9;

public class Day9_1 {
    public int addAB(int A, int B) {
        // write code here
        if (B == 0) {
            return A;
        }
        int sum;
        int carray;
        while (B != 0) {
            sum = A ^ B;
            carray = (A & B) << 1;
            A = sum;
            B = carray;
        }
        return A;
    }
}