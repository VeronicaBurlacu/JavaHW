package class10;

public class arrayEx {
    public static void main(String[] args) {
        int [] [] matrix={
                {10,20,30,40,50,},
                {34,56,67,20},
                {23,45,66},
                {20,55}

        };
        for (int i = 0; i < matrix.length; i++) {
            int []arr=matrix[i];
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.println(matrix[i][j]+" ");


            }

            System.out.println();
        }
    }
}
