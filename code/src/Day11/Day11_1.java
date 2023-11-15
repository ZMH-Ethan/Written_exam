package Day11;

public class Day11_1 {
    public int getLCA(int a, int b) {
        // write code here
        while (a != b) {
            if (a > b) {
                a /= 2;
            }else {
                b /= 2;
            }
        }
        return a;
    }
}
