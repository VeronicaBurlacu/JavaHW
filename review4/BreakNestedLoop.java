package review4;

public class BreakNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i <=9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <=9 ; k++) {
                    System.out.println(i+" "+j+" "+k);}

                }

            }

        System.out.println("-------------------");

        for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("hello");
                //will print 3 times hello and 1 bye bc the break broke the loop
            }
            System.out.println("bye");
            break;
        }
        System.out.println("--------------");
        for (int i = 1 ; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("hello");
                break;//bc it is the inner loop you can still go to the outer so still it runs
                //hello, bye ,hello, bye

            }
            System.out.println("bye");
        }
        System.out.println("------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("hello");
                break;// just 1 hello and 1 bye bc the break in both parts

            }
            System.out.println("bye");
            break;
        }
    }
}
