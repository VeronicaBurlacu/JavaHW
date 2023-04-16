package review4;

public class continueNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2){
                    continue;//it says to skip the 2
                }
                System.out.println("hello");
            }
            System.out.println("bye");
        }
        System.out.println("---------------------");
        for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(i==2){
                    continue;
                }
                System.out.println("hello");//3 hello and 2 bye
            }
            System.out.println("bye");
        }
    }
}
