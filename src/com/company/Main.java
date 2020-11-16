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

        int c = findPDA(n);
        if (c == -1) System.out.println(n + " is input error");
        else if (c == 0) System.out.println(n + " is Deficient");
        else if (c == 1) System.out.println(n + " is Perfect");
        else System.out.println(n + " is Abundant");

        System.out.print("Enter p : ");
        int p = sc.nextInt();
        System.out.print("Enter q : ");
        int q = sc.nextInt();
        System.out.println("gcd of " + p + " and " + q + " is " + findGcd(p, q));

        System.out.println("lcd of " + p + " and " + q + " is " + findLcd(p, q));

        System.out.print("Enter No : ");
        int no = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.println(no + " to base " + base + " is " + base10to(no, base));

        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.print("Enter base : ");
        int base2 = sc.nextInt();
        System.out.println(number + " base " + base2 + " to base 10 ---> " + baseXto10(number, base2));
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

    public static int findPDA(int n) {
        if (n <= 1) return -1;
        else {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) sum = sum + i;
            }
            if (sum == n) return 1;
            else if (sum < n) return 0;
            else return 2;
        }
    }

    public static int findGcd(int p, int q) {
        int t;
        while (q != 0) {
            t = q;
            q = p % q;
            p = t;
        }
        return p;
    }

    public static int findLcd(int p, int q) {
        int l = p * q / findGcd(p, q);
        return l;
    }

    public static int base10to(int no, int base) {
        int ans = 0, x;
        for (int i = 0; no != 0; i++) {
            x = no % base;
            no = no / base;
            ans = ans + x * (int) Math.pow(10, i);
        }
        return ans;
    }

    public static int baseXto10(int number, int base2) {
        int ans = 0, y;
        for (int i = 0; number != 0; i++) {
            y = number % 10;
            number = number / 10;
            ans = ans + y * (int) Math.pow(base2, i);
        }
        return ans;
    }
}
