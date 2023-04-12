package HomeWork;

import java.util.Scanner;

public class intelij {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny=scan.nextBoolean();
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the temperature outside?");
        int temperature=scanner.nextInt();
        if(true){
            System.out.println("It is a sunny day, I should go somewhere!");
            if(false){
                System.out.println("I stay home and practise Java");
                if(temperature>85){
                    System.out.println("I am going to the beach");
                    if(temperature<85){
                        System.out.println("I am going to the park");
                    }

                }
            }
        }
    }
}