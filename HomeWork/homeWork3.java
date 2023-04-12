package HomeWork;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {

        /*Write a program for user to enter his/hers birth month. Based on the month define the season.
                Example: if user is born in March, April, May → season =”Spring”
        if user is born in June, July, August →
        season =”Summer”  etc …
        At the end of the program we should see 1 output as “You were born is season __”.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your birth month?");
        String name=scanner.next();
        if(name.equals("april")||name.equals("may")||name.equals("march"));
        {
            System.out.println("you were born is season spring");
        } if(name.equals("june")||name.equals("july")||name.equals("august")){
            System.out.println("you were born is season summer");
        } if(name.equals("september")||name.equals("october")||name.equals("november")){
            System.out.println("you were born is season fall");
        } else if(name.equals("december")||name.equals("january")||name.equals("february")){
            System.out.println("you were born is season winter");
        }
        }

    }

