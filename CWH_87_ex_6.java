package com.company;
import java.util.Scanner;

class InvalidException extends Exception {
    @Override
    public String toString() {
        return "Please input a valid number";
    }
}
class CannotDivideException extends Exception {
    @Override
    public String toString(){
        return "Cannot divide by 0";
    }
}
class MaxInputException extends Exception {
    @Override
    public String toString(){
        return "Input number is very large";
    }
}
class MaxMultiplierException extends Exception {
    @Override
    public String toString() {
        return "Multiplier reached its peak value";
    }
}

public class CWH_87_ex_6 {

    public static void check(int x) throws InvalidException{
        if(x<0||x>5)
        {
            throw new InvalidException();
        }
    }

    public static void max(int x,int y) throws MaxInputException{
        if(x<=-10000||x>=10000||y<=-10000||y>=10000)
        {
            throw new MaxInputException();
        }
    }
    public static void divide(int x,int y) throws CannotDivideException{
        if(x==0||y==0)
        {
            throw new CannotDivideException();
        }
    }
    public static void Multiplier(int x) throws MaxMultiplierException{
        if(x<=-10000||x>=10000)
        {
            throw new MaxMultiplierException();
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,ch;
        while(true){
            System.out.println("Enter you choice \n1. + \n2. - \n3. * \n4. / \n5.exit");
            ch=sc.nextInt();
            try{
                check(ch);
            }
            catch(Exception e){
                System.out.println(e);
                continue;
            }
            if(ch==5)break;
            System.out.println("Enter two numbers");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            try {
                max(num1,num2);
            }
            catch(Exception e)
            {
                System.out.println(e);
                continue;
            }
            if(ch==1){
                try{
                    int z=num1+num2;
                    Multiplier(z);
                    System.out.println(z);

                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
           else if(ch==2){
                try{
                    int z=num1-num2;
                    Multiplier(z);
                    System.out.println(z);

                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
           else if(ch==3){
                try{
                    Multiplier(num1*num2);
                    System.out.println(num1*num2);

                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            else if(ch==4){
                try{
                    divide(num1,num2);
                    System.out.println(num1/num2);

                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }

    }
}
