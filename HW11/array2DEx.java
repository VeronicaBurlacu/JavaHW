package HW11;

public class array2DEx {
    public static void main(String[] args) {//add all the elements for each row and print their sum
        int [][]arr2D= {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5,},
                {10, 8, 6, 4, 2}
        };
        int sum1=0;

        for (int[] arr1D : arr2D) {
            for (int num :arr1D) {
               sum1=sum1+num;

            }
            System.out.println(sum1);
        }


    }
}
