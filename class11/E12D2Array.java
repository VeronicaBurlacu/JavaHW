package class11;

public class E12D2Array {
    public static void main(String[] args) {//print only odd numbers
        int [][]arr={{10,20,30,40,50},
                      {1,2,3,4,5},
                       {5,5,5,5,5,},
                      {10,8,6,4,2}
        };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if(anInt%2==1){
                    System.out.println(anInt);
            }
        }
        }
             //another way to solve it
        for (int row = 0; row < arr.length; row++) {//int [] innerArray=arr[row]=>innerArray.length
            for (int column = 0; column < arr[row].length; column++) {//arr[row]=>gives me the array index by row
                // use it only the numb raw and column are the same
               if(arr[row][column]%2!=0) {//int element=arr[i][j];   //if(element%2!=0)
                   System.out.println(arr[row][column]);//System.out.println(element);
               }
            }

        }//even numb print //HOW TO PRINT EVEN NUMBERS
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
            System.out.println("sum = " + sum);


        }

    }

