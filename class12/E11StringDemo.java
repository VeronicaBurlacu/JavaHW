package class12;

import java.util.Scanner;

public class E11StringDemo {
    public static void main(String[] args) {
        String name = "Today is Saturday";
        System.out.println(name.indexOf('i'));
        System.out.println("................");
        System.out.println(name.indexOf('a'));
        //start the search from index num 4
        System.out.println(name.indexOf('a',4));
        //print all the indexes wherever the letter 'a' is appearing
        String name1 = "Today is Saturday";
     int num=0;
        for (int index = 0; index < name.length(); index++) {
            if(name1.charAt(index)=='a'){

                System.out.println(index+" ");
                System.out.println(name.charAt(index));
            }



        }



    }
}
