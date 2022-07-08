package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
     Random r=new Random();
     Scanner sc=new Scanner(System.in);
     int i=0;
        System.out.println("Enter your Name:");
        String name=sc.next();
        System.out.println("Welcome "+name+" !! Lets begin the game.There will be total 5 rounds. BEST WISHES");
        System.out.println("You have to choose \n 0-rock \n 1-Scissor \n 2-Paper \n");
        int x=0,y=0;

     while(i<5)
     {
         System.out.print(name+" = ");
         int user=sc.nextInt();
         int opp=r.nextInt(3);
         System.out.println("opp = "+opp);
         if(user==opp)
         {
             System.out.println("------------"+"Draw"+"------------");
         }
         else if(user==0&&opp==1 || user==1&&opp==2 ||
                 user==2&&opp==0)
         {

             x++;System.out.println("------------"+name+" wins "+x+"-------------");

         }
         else if((opp==2&&user==0) || (opp==1&&user==2) || (opp==0&&user==1)) {

             y++;System.out.println("------------"+"opp wins "+y+"------------");
         }


         i++;
     }
        System.out.println("************************************************************************************");
     if(x>y)
         System.out.println(name+" Won "+x+"-----"+y);
     else if(y>x)
         System.out.println(name+" Lose"+y+"----"+x);
     else
         System.out.println("Match draw"+y+"-----"+x);
        System.out.println("************************************************************************************");
    }
}
