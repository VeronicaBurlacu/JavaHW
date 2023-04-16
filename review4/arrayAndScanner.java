package review4;

import java.util.Scanner;

public class arrayAndScanner {
    public static void main(String[] args) {
        //create an array that stores numbers from user nd then we want to find
        //to calculate the average of numbers
        Scanner scan=new Scanner(System.in);
        System.out.println("how many integers you want to store?");
       int size =scan.nextInt();
       int []numbers=new int[size];// numbers:[0,0,0,0]
        for (int i = 0; i < size; i++) {//size is 4
            System.out.println("please enter "+(+i+1)+" element");//numbers:[12,35,67,12]
            numbers[i]=scan.nextInt();

        }

    }
}
