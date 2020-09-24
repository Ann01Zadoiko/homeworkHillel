package com.zadoiko.homework._01;

import java.util.Scanner;

public class Task_03 {
    public static void main (String args []) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter a->");
        double a = s.nextDouble();
        System.out.println("Enter b->");
        double b = s.nextDouble();
        System.out.println("Enter c->");
        double c = s.nextDouble();
        double p=(a+b+c)/2;
        double S= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Half-perimeter is equal:"+p);
        System.out.printf("Area :%5.2f",S);
    }
}
