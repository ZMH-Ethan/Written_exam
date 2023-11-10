package Day6;

public class Day6_2 {
    public int StrToInt(String str) {
        char[] chs = str.toCharArray();
        if(str.isEmpty())
            return 0;

        int symbol = 1;
        if(chs[0] == '-'){ //处理负号


            symbol = -1;
            chs[0] = '0'; //这里是字符'0',不是0

        } else if(chs[0] == '+'){ //处理正号

            symbol = 1;
            chs[0] = '0';
        }

        int sum = 0;
        for(int i=0;i < chs.length;++i) {
            if(chs[i] < '0' || chs[i] > '9') {
                sum = 0;
                break;
            }

            sum = sum *10 + chs[i] - '0';

        }
        return symbol * sum;
    }
}
