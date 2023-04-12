package class7;

public class E10WhileLoop {
    public static void main(String[] args) {
        // print 1 2 4 5 7  8 10 11 13 14 15 16 17 18 19 20
        int i=1;
        while(i<=20){
            if(i%3!=0){

                System.out.print(i+ " " );

            }
            i++;
        }
    }
}
