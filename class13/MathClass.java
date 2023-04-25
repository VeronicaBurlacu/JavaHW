package class13;

public class MathClass {

    void add(int num1,int num2){
        System.out.println(num1+num2);

    }//define method
    void multiply(int num3,int num4){
        System.out.println(num3*num4);
    }


    public static void main(String[] args) {
        MathClass math=new MathClass();
        math.add(10,10);

MathClass ply=new MathClass();
ply.multiply(10,10);
    }
}