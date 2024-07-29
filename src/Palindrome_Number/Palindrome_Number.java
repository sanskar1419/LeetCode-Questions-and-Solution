package Palindrome_Number;

import java.util.Scanner;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        if (x >= 0 && x < 10)
            return true;

        int reversedNumber = 0;
        int temp = x;

        while (temp != 0) {
            int reminder = temp % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            temp = temp / 10;
        }

        return x == reversedNumber;

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number for palindrome check : ");
        int x = s.nextInt();
        System.out.println(isPalindrome(x));
    }
}
