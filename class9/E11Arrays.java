package class9;

public class E11Arrays {
    public static void main(String[] args) {
        //there are 2 ways of creating arrays
        // new int[]>means create an array of int with size 5
        //empty array
        int [] numbers=new int[5];
        numbers[2]=50;//store 50 on index 2
        numbers[0]=100;
        numbers[3]=199900;
        numbers[4]=1211;
        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println();
        for (int number : numbers) {
            System.out.println(number+" ");

        }

        }
    }

