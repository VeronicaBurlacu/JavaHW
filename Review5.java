public class Review5 {
    public static void main(String[] args) {
        int[][] numbers=new int[3][4];
        //1 row
        numbers[0][0]=1;
        numbers[0][1]=2;
        numbers[0][2]=3;
        numbers[0][3]=4;
        //2nd row
        numbers[1][0]=10;
        numbers[1][1]=20;
        numbers[1][2]=30;
        numbers[1][3]=40;
        //3rd row
        numbers[2][0]=100;
        numbers[2][1]=200;
        numbers[2][2]=300;
        numbers[2][3]=400;
        //how to find how many row we have
        System.out.println(numbers.length);//3
        System.out.println(numbers[0].length);//4
        for (int row = 0; row<numbers.length;row ++) {//outer loop iterates over the rows
            System.out.println();
            for (int column = 0; column < numbers[row].length; column++) {//inner loop iterates over the column
                int num=numbers[row][column];
                if(num%3==0){//for negative numb//if(num<0) //for odd if(num%2!=0)
                System.out.println(numbers[row][column]);}


            }
        }
    }
    }
