package com.company;

public class Main2 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum NE chet = "+sum);
    }
}
