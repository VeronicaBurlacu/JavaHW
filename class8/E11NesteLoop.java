package class8;

public class E11NesteLoop {
    public static void main(String[] args) {
        //2 4 6 8 10
        //2 4 6 8 10
        //2 4 6 8 10
        //2 4 6 8 10



       int c=0;
        while(c<4){
            for (int i = 0; i<=10; i = i + 2) {

                System.out.print(i + " ");
            }
            System.out.println();
            c++;
        }

    }
}







