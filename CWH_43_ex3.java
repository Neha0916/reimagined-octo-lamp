package com.company;

import java.util.Scanner;
import java.util.Random;

class game2{
    int no,x,c=0;
    public int game2(){
     Random r=new Random();
    no=r.nextInt(100);
    return no;
    }
    public int takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number");
        x=sc.nextInt();
        return x;
    }
    public int noOfGuess(){
        c++;
        return c;
    }
    public void isCorrectNumber(int n,int y){
        if(n==no) {
            System.out.println("---------CORRECT ANSWER---------");
            if(y<2)
                System.out.println("------BRILLIANT------");
            else if(y<10)
                System.out.println("-----AWESOME------");
            else
                System.out.println("------GOOD JOB-----");
            System.out.println("******************** The Random choosen number was: "+n+" *****************");
        }
        else if(n>no)
            System.out.println("Number is greater than the assumed number");
        else
            System.out.println("Number is lesser than the assumed number");
    }
}
public class CWH_43_ex3 {
    public static void main(String[] args) {
        game2 obj=new game2();
        int num1=obj.game2();
        int num2=0,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Name:");
        String name=sc.nextLine();
        System.out.println("----Welcome--"+name+"---to a wonderful game which is named as ***GUESS THE NUMBER***---------\n" +
                "How to play it\n" +
                "You just have to guess the number and enter it," +
                "\nthen the system itself will tell you whether you" +
                " \nhave choosen a correct or wrong number.\n" +
                "--------GOOD LUCK-------");
        while(num1!=num2){
            num2=obj.takeUserInput();
            count=obj.noOfGuess();
            obj.isCorrectNumber(num2,count);
        }
        System.out.println("***********THANKS FOR PLAYING "+name.toUpperCase()+" *********\n ------GOOD DAY!!!------");
    }
}
