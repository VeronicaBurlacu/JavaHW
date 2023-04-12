package class4;

import java.util.Scanner;

public class E9Scanneer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("are you hungry enter true or false");
        boolean hungry= scanner.nextBoolean();
        if(hungry) {
            System.out.println("lets order pizza");
        } else {
            System.out.println("lets practise java");

            }

        }
    }

