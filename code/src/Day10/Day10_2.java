package Day10;

import java.util.Scanner;

public class Day10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            int sum1 = getLen(str);
            int sum2 = getChar(str);
            int sum3 = getNum(str);
            int sum4 = getSym(str);
            int sum = 0;

            if (sum2==20 && sum3>=10 && sum4>=10) {
                sum = sum1 + sum2 + sum3 + sum4 + 5;
            } else if (sum2==10 && sum3>=10 && sum4>=10) {
                sum = sum1 + sum2 + sum3 + sum4 + 3;
            } else if (sum2==10 && sum3>=10 && sum4==0) {
                sum = sum1 + sum2 + sum3 + sum4 + 2;
            }else {
                sum = sum1 + sum2 + sum3 + sum4;
            }

            if (sum >= 90) {
                System.out.println("VERY_SECURE");
            } else if (sum >= 80) {
                System.out.println("SECURE");
            } else if (sum >= 70) {
                System.out.println("VERY_STRONG");
            } else if (sum >= 60) {
                System.out.println("STRONG");
            }else if (sum >= 50) {
                System.out.println("AVERAGE");
            }else if (sum >= 25) {
                System.out.println("WEAK");
            }else if (sum >= 0) {
                System.out.println("VERY_WEAK");
            }
        }
    }
    public static int getLen(String str) {
        if (str.length() <= 4) {
            return 5;
        } else if (str.length() <= 7) {
            return 10;
        } else if (str.length() >= 8) {
            return 25;
        }
        return 0;
    }
    public static int getChar(String str) {
        int small = 0;
        int big = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                big++;
            }else if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                small++;
            }
        }
        if (small>0 && big>0) {
            return 20;
        } else if (small>0 || big >0) {
            return 10;
        }else {
            return 0;
        }
    }
    public static int getNum(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)-'0' >= 0 && str.charAt(i)-'0'<=9) {
                num++;
            }
        }
        if (num>1) {
            return 20;
        } else if (num==1) {
            return 10;
        }else {
            return 0;
        }
    }
    public static int getSym(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i)>=65&&str.charAt(i)<=90)&&!(str.charAt(i)>=97&&str.charAt(i)<=122)&&!(str.charAt(i)-'0'>=0&&str.charAt(i)-'0'<=9)) {
                num++;
            }
        }
        if (num>1) {
            return 25;
        } else if (num==1) {
            return 10;
        }else {
            return 0;
        }
    }
}
