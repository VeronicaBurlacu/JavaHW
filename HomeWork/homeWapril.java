package HomeWork;

public class homeWapril {
    public static void main(String[] args) {
        //print numbers from 100 to 1
        for( int b=100;0<b;b--){
            System.out.print(b+" ");
        }
//Print even numbers from 20 to 1 (2 ways)

        int num=20;
        System.out.println();
        while(num>=1){
            if(num%2==0){
                System.out.println(num+" ");
            }num--;


        }//Print numbers from 100 to 1
        int n=100;
        while(n>=1) {
            System.out.println(n + " ");
            n--;
        }

        //Print odd numbers between 20 and 50 (2 ways
        int b=20;
        while(b<=50){
            if(b%3!=0){
                System.out.print(b+" ");b+=3;
            }
        }



        }
    }

