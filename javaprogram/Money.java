package javaprogram;

import java.util.Scanner;
 public class Money{
    int rs,paise;

    Money(){
        System.out.println("Enter amount in rupees and paise");
Scanner sc= new Scanner(System.in);
rs=sc.nextInt();
paise=sc.nextInt();


    }
    void display(){
        int total = rs*100+paise;
        System.out.println("amout in  paise = "+total);

    }
    public static void main(String args[]){
     Money m= new Money();
     m.display();
    }
}