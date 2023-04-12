package class6;

import java.util.Scanner;

public class E4LogicalOp {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your height in inches");
        int height=scanner.nextInt();



        if(height<60){
            System.out.println("short");
        }else if(height>=80 && height<=72){
            System.out.println("medium");

        }else {
            System.out.println("tall");

        }

    }
}
