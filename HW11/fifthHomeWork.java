package HW11;

public class fifthHomeWork {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.
        int [][] numbers={ {2,7,8,9},
                          { 2,8,5,9 },
                          {2,3,6,8 }

        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {


                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");

                }

            }
        }


        }





}
