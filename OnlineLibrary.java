package com.company;
import java.util.Scanner;
public class OnlineLibrary {
    String [] availableBooks = new String[100];
    String [] issuedBooks = new String[100];
    OnlineLibrary()
    {
        availableBooks[0]="Maha Bharat";
        availableBooks[1]="Ramayan";
        availableBooks[2]="The jungle book";
        availableBooks[3]="Three mistake of my life";
        availableBooks[4]="C++";
        availableBooks[5]="java";
        availableBooks[6]="Python";
        availableBooks[7]="PHP";
    }

    void addBook(String x){
        int c=0;
        for(String i : availableBooks)
        {
            if(i==null)
            {
                availableBooks[c]=x;
                break;
            }
            c++;
        }
        System.out.println("Added Successfully.");


    }
    void issueBook(String x){
        int c=0, c1=-1;
        for(String i : availableBooks)
        {
            if(i!=null)
                if(i.compareToIgnoreCase(x)==0)
                {
                    for(String j:issuedBooks)
                    {
                        c1++;
                        if(j==null)
                        {
                            issuedBooks[c1]=availableBooks[c];
                            break;
                        }
                    }
                    availableBooks[c]=null;
                    System.out.println("The book "+ x+ " is issued to you.");
                    break;
                }
            c++;

        }
        if(c1==-1)
        {
            System.out.println("The book is not Available.");
        }


    }
    void returnBook(String x){
        int c=0,d=0;
        for(String i:issuedBooks)
        {
            if(i!=null)
                if(i.compareToIgnoreCase(x)==0)
                {
                    d=1;
                    addBook(i);
                    issuedBooks[c]=null;
                    break;
                }
            c++;
        }
        if(d==0)
            System.out.println("Check your entry");
        }


    void showAvailableBooks(){
        int c=0;
        for(String i:availableBooks)
        {
            if(i!=null)
            {
                System.out.println(++c +". "+i);
            }
            if(c==0)
            {
                System.out.println("No books Available.");
            }
        }
    }
    public static void main(String[] args) {
        int n=-1;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        OnlineLibrary obj = new OnlineLibrary();
        System.out.println("-----Welcome to Library-----");
        System.out.println("Press 1 to View Available Books.");
        System.out.println("Press 2 for adding a book to the Library.");
        System.out.println("Press 3 to issue a Book.");
        System.out.println("Press 4 to return a Book.");
        System.out.println("Press 5 to exit.");
        System.out.println();
        System.out.println();
        System.out.println("Enter Your Choice:- ");
        while(n!=5)
        {
            n=sc.nextInt();
            System.out.println();
            System.out.println();
            switch (n)
            {
                case 1:
                    obj.showAvailableBooks();
                    break;
                case 2:
                    System.out.println("Enter a book name to add in the Library:- ");
                    obj.addBook(sc2.nextLine());
                    break;
                case 3:
                    System.out.println("Enter a book name to get it issued:- ");
                    obj.issueBook(sc2.nextLine());
                    break;
                case 4:
                    System.out.println("Enter book name to return:- ");
                    obj.returnBook(sc2.nextLine());
                    break;
                case 5:
                    System.out.println("Exiting from the menu..");
                    break;
                default:
                    System.out.println("You have enter a invalid choice.");
            }
            System.out.println("Enter your choice again:-");

        }

    }
}

