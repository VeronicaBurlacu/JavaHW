package class4;

import java.util.Scanner;

public class hwN4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("what is your city?");
        String city=scanner.next();
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your temperature?");
        int temperature=scanner.nextInt();
        temperature=(temperature-32)*5/9;

        System.out.println("The temperature in your "+city+ " is "+temperature+" degree Celsius");





    }
}
