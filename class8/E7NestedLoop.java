package class8;

public class E7NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            for(int j=0; j<10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}