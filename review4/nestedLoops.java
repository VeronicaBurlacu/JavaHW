package review4;

public class nestedLoops {
    public static void main(String[] args) {
        //nested loop =>loop inside ANOTHER LOOP
       /* for(){
            for(){}
                while(){}
        }*/
        for (int i = 1; i <=3 ; i++) {//outer
            System.out.print(i );
            for (int j = 0; j <=1 ; j++) {//inner (inner depends on outer)
                System.out.println(j);
            }
        }
    }
}
