package com.zadoiko.homework._01;

import java.util.Scanner;

public class Task_04 {
    public static void main (String args[]) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter a->");
        double a = s.nextDouble();
        System.out.println("Enter b->");
        double b = s.nextDouble();
        System.out.println("Enter c->");
        double c = s.nextDouble();
        double D=0, x1, x2;
        if (a !=0) {D=b*b-4*a*c;}
        else
        {System.out.println("No roots");}

        x1=(-b+D)/2*a;
        x2=(-b-D)/2*a;
        System.out.println("Max:"+Math.max(x1, x2)+"     Min:"+Math.min(x1,x2));

    }
}
