package class7;

import java.util.Scanner;

public class E14WhileLoop {
    public static void main(String[] args) {
        //ask the user for a number print all the numbers from 1 to that number

        Scanner scanner=new Scanner(System.in);
        System.out.println("Print a number pls greater trhan 1");
        int num= scanner.nextInt();
        int counter=1;
        while(counter<=num){

            System.out.print(counter+" ");
           counter++;
        }
    }
}
