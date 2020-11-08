package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("reverse of " + n + " is " + reverse(n));
        if(n==reverse(n)) System.out.println(n+" is palindrome");
        else System.out.println(n+" is not palindrome");

    }

    public static int reverse(int n) {
        int ans = 0, digit, x = n;
        while (n != 0) {
            digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        return ans;
    }
}
