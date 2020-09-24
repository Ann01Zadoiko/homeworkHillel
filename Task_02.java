package com.zadoiko.homework._01;

import java.util.Scanner;

public class Task_02 {
    public static void main (String args []) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a->");
        double a = s.nextDouble();
        System.out.println("Enter b->");
        double b = s.nextDouble();
        double c;
        c=Math.log10(b)/Math.log10(a);
        System.out.println("logarithm is equal->"+c);
    }
}
