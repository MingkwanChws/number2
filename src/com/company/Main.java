package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("reverse of " + n + " is " + reverse(n));

        boolean a = palin(n);
        if (a) System.out.println(n + " is palindrome");
        else System.out.println(n + " is not palindrome");

        boolean b = primeNo(n);
        if (b) System.out.println(n + " is prime");
        else System.out.println(n + " is not prime");
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

    public static boolean palin(int n) {
        int ans = reverse(n);
        if (ans == n) return true;
        else return false;
    }

    public static boolean primeNo(int n) {
        if (n <= 1) return false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}
