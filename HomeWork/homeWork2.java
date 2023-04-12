package HomeWork;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        /*Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000*/
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter one number from 1 to 1000");
        int num= scan.nextInt();
        if(num<10){
            System.out.println("it is a small number");

        }else if(num<100){
            System.out.println("it is a medium number");

        }else{
            System.out.println("it is a large number");
        }


    }
}
