package class8;

public class E5WhileBreak {
    public static void main(String[] args) {
        //create aboolean summer store true in it
        //then write a loop that runs till summer creat a temp var =>85

        //inside the loop check the temp.if its less than 100 print"its good i enjoy summer
        //as soon as temp exeed summer print"its very hot"and finsh with break
        boolean summer = true;
        int temp = 85;
        while (summer) {
            if (temp < 100) {
                System.out.println("its good I enjoy summer");

            } else {

                System.out.println("its very hot");
                break;
            }
            temp = temp +2;
        }
    }
}