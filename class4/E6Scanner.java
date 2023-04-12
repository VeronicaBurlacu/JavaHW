package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.next();
        if(name.equals("veronica")){
            System.out.println("mac user");}
        else{
            System.out.println("window user");}
          if(name.equals("safian")){
            System.out.println("naughty");

        }
        else if(name.equals("halima")){
            System.out.println("best");
        }
        else if(name.equals("alex")){
            System.out.println("bad boys");
        }

    }
}
