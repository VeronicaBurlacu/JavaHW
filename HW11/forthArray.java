package HW11;

public class forthArray {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.
        int [] []arr={  {1,2,3},
                        {4,5,6},
                        {7,8,9}
        };int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum=sum+arr[i][j];

            }

        }
        System.out.println(sum);
    }
}
