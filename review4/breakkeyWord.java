package review4;

public class breakkeyWord {
    public static void main(String[] args) {
        for (int i = 1; i <5 ; i++) {
            if(i==3){//we use Break only when we want to stop at a certain point but always with IF
                break;//it will print only 1,2
            }
            System.out.println(i);//BREAK stops the loop
        }
        System.out.println();
        //CONTINUE=>skip current iteration/moves to the next iterration
    }
}
