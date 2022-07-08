package com.company;
import java.util.Scanner;
class library {
    String[] addbook = new String[100];
    String[] issuedbook = new String[100];
    Scanner sc = new Scanner(System.in);
    int i = 0;

    public void addBook() {
        System.out.println("Enter the name of the book which is to be added");
        String b = sc.nextLine();
        addbook[i++] = b;
        System.out.println(b + " book has been added");
    }

    public boolean issueBook() {
        System.out.println("Enter the code of book");
        int x = sc.nextInt();
        issuedbook[x - 1] = addbook[x - 1];
        return true;
    }

    public boolean returnBook() {
        System.out.println("Enter the code of book");
        int x = sc.nextInt();
        issuedbook[x - 1] = null;
        return false;
    }

    public void showAvailablebooks() {
        for(int j=0;j<i;j++)
        {
            if(addbook[j]!=issuedbook[j])
                System.out.println("Code "+(j+1)+"-----"+addbook[j]);
        }
        }
//        for (String book : this.addbook) {
//            System.out.println("* " + book);
//        }
//
//    }

    public class CWH_51_ex4_onlineLib {
        public static void main(String[] args) {
            library lib = new library();
            boolean bool = false, bol = true;
            Scanner sc = new Scanner(System.in);
            int ch;
            do {
                if (bool)
                    System.out.println("Please Return the book which has been issued");
                System.out.println("1.Show Available books \n2.Add Book \n3.Issue A Book \n4.Return Book \nEnter your Choice:");
                ch = sc.nextInt();
                if (ch == 1) {
                    lib.showAvailablebooks();
                } else if (ch == 2) {
                    lib.addBook();
                } else if (ch == 3) {
                    bool = lib.issueBook();
                } else if (ch == 4) {
                    bool = lib.returnBook();
                } else {
                    System.exit(0);
                }

            } while (bool);
        }
    }
}
