package HomeWork;

import java.util.Scanner;

public class homwWork4 {
    public static void main(String[] args) {
        /*Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night*/

        Scanner minutes=new Scanner(System.in);
        System.out.println("What is the time now?");
        int hours= minutes.nextInt();
        if(hours<=11){
            System.out.println("morning time");
        }if(hours<=15){
            System.out.println("it is afternoon");
        }if(hours<=20){
            System.out.println("it is evening");
        }else if(hours<=24){
            System.out.println("it is night");
        }
    }
}
