package class8;

import java.util.Scanner;

public class E1WileLoop {
    public static void main(String[] args) {
        //print all the whole num from 15 to 30
        for(int i=15;i<=30;i++){
            System.out.print(i+" ");
        }
        int number=15;
        while(number<=30){
            System.out.print(number+" ");
            number++;
        }
        //all num to a starting point to an ending point
        //ask the user to enter the startin point an en
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter any num to start and end");
        int start= scanner.nextInt();//5
        int end= scanner.nextInt();//10
        int step=scanner.nextInt();//
        int number1=start;
        while(number1<=end){
            System.out.println(number1+" ");
            number1=number1+step;//the same as number++
        }

        }

    }

