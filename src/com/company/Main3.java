package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int n = 2;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("input current high: ");
            int high = input.nextInt();

            sum += high;
        }

        double avg = sum / (double)n;
        System.out.print("avg high = "+ avg);
    }
}
