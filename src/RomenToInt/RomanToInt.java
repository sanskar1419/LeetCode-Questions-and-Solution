package RomenToInt;

import java.util.Scanner;

public class RomanToInt {
    public static int romanToInt(String s) {

        if (s.isEmpty())
            return 0;

        int ans = 0, num = 0, i = s.length() - 1;
        while (i >= 0) {
            int j = i - 1;
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (i != 0) {
                if ((s.charAt(i) == 'V' && s.charAt(j) == 'I') || (s.charAt(i) == 'X' && s.charAt(j) == 'I')) {
                    num = num - 1;
                    i = i - 2;
                } else if ((s.charAt(i) == 'L' && s.charAt(j) == 'X') || (s.charAt(i) == 'C' && s.charAt(j) == 'X')) {
                    num = num - 10;
                    i = i - 2;
                } else if ((s.charAt(i) == 'D' && s.charAt(j) == 'C') || (s.charAt(i) == 'M' && s.charAt(j) == 'C')) {
                    num -= 100;
                    i = i - 2;
                } else {
                    i--;
                }

                ans = ans + num;
            } else {
                ans = ans + num;
                i--;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the roman string : ");
        String x = s.next();
        System.out.println(romanToInt(x));
    }
}
