package class4;

import java.util.Scanner;

public class E8Scanner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your salary");
        int salary=scanner.nextInt();
        if(salary>10000){
            System.out.println("yoy are rich");
        } else {
            System.out.println("look for  a better opportunity");
        }
    }
}
