package com.company;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
class gameSnake{
    int x;
    public int dice(int i){
      Random r=new Random();
       x=r.nextInt(1,6);
        System.out.println("User "+i+" = "+x);
      return x;
    }
    public int snake(int a){
        switch (a) {
            case 11 : System.out.println("----SNAKE---"); return 9;
            case 36 : System.out.println("----SNAKE---"); return 14;
            case 43 : System.out.println("----SNAKE---"); return 22;
            case 57 : System.out.println("----SNAKE---"); return 19;
            case 66 : System.out.println("----SNAKE---"); return 47;
            case 81 : System.out.println("----SNAKE---"); return 63;
            case 90 : System.out.println("----SNAKE---"); return 49;
            case 94 : System.out.println("----SNAKE---"); return 48;
            case 96 :System.out.println("----SNAKE---"); return 65;
            case 99 : System.out.println("----SNAKE---"); return 78;
            default : return a;
        }
    }
    public int ladder(int a){
        switch (a) {
            case 4 : System.out.println("---Ladder----"); return 26;
            case 8 : System.out.println("---Ladder----"); return 51;
            case 28 : System.out.println("---Ladder----"); return 46;
            case 39 : System.out.println("---Ladder----"); return 60;
            case 44 : System.out.println("---Ladder----"); return 80;
            case 52 : System.out.println("---Ladder----"); return 68;
            case 64 : System.out.println("---Ladder----"); return 85;
            case 69 : System.out.println("---Ladder----"); return 93;
            case 71 : System.out.println("---Ladder----"); return 92;
            case 84 : System.out.println("---Ladder----"); return 98;
            default :return a;
        }
    }
}
public class snakeAndLadder {
    public static void main(String[] args) {
        gameSnake g=new gameSnake();
        int x=0,y=0,i=0,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------------Welcome to Snake And Ladder Game-----------------------------------");
        System.out.println("User 1 please Enter your name ---");
        String user1=sc.nextLine();
        System.out.println("User 2 please Enter your name ---");
        String user2=sc.nextLine();
        while(true)
        {
            if(i%2==0){ System.out.println(user1+"---Roll the Dice by pressing 1");
               k=sc.nextInt();
               x=x+g.dice(k);
               x=g.ladder(x);
               x=g.snake(x);
               System.out.println(user1+"---"+x);
                System.out.println("\n");}

              else{ System.out.println(user2+"---Roll the Dice by pressing 2");
               k=sc.nextInt();
               y=y+g.dice(k);
               y=g.ladder(y);
               y=g.snake(y);
               System.out.println(user2+"---"+y);
                System.out.println("\n");}
                i++;
               if(x==100)
               {
                   System.out.println("\n \n \n*****************************************************************************************");
                   System.out.println(user1+" is the WINNER !!!!!!! CONGRATULATIONS");break;
               }

               else if(y==100) {
                   System.out.println("\n \n \n*****************************************************************************************");
                   System.out.println(user2+" is the WINNER !!!!!!! CONGRATULATIONS");break;
               }
        }


    }
}
