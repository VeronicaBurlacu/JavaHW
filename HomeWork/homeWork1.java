package HomeWork;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        /* Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”,
         anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”*/



        Scanner scanner=new Scanner(System.in);
        System.out.println("Please print any number from 1 to 100");
        int dat= scanner.nextInt();
if(dat<=5)
{System.out.println("It is a weekday");

        }else if(dat<=7){
    System.out.println("It is a weekend");
}else{
    System.out.println("Invalid day");
}



    }
    }

