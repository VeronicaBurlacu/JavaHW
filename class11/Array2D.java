package class11;

public class Array2D {
    public static void main(String[] args) {
        //even numb print //HOW TO PRINT EVEN NUMBERS
        int [][]arr1={{10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5,},
                {10,8,6,4,2}
        };
        int sum=0;
        for (int[] ints : arr1) {
            for (int anInt : ints) {

                if (anInt % 2 == 0) {
                    sum++;

                }

            }
        }
        System.out.println("sum = " + sum);//shortcut (soutv+enter) automatticaly will give that result


    }
}
