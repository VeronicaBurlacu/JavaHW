package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        // ask the user to enter a number and if use eneter any num
        //other thann -1 print "try again" and keep asking the user for numb
        //the moment user enter -1 the loop shoul stop
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any num");
        int number = scanner.nextInt();

     while(number!=-1){
         System.out.println("try again");
         number=scanner.nextInt();
     }


        }

     }



