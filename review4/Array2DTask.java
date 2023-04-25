package review4;

public class Array2DTask {
    public static void main(String[] args) {
        //Write a program that sums all numbers that are on even index and on even row.

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sum =0;
        for(int i =0;i<a.length;i++){//(-5+-3)=-8
            if(i%2==0){
                for(int j =0 ;j<a[i].length;j++){//(1+4)=4
                    if(j%2==0){
                        sum+=a[i][j];// -8+4=4
                    }
                }

            }

        }

        System.out.println(sum);
    }
}
