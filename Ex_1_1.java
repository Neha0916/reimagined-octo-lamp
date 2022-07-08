package com.company;
import java.util.Scanner;

public class Ex_1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks for 5 subjects");
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        float m4=sc.nextFloat();
        float m5=sc.nextFloat();
        float sum=m1+m2+m3+m4+m5;
        float percentage=(sum*100)/500;
        System.out.println("Percentage = ");
        System.out.println(percentage);

    }
}
