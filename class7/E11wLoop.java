package class7;

public class E11wLoop {
    public static void main(String[] args) {
        int num=100;
        while(num>0){
            num--;
            System.out.print(num+" ");
        }
        //we are assighning a new value to the counter for next loop
         num=20;//print even num
        System.out.println();//ca sa vedem
        while(num<=100){
            System.out.print(num+" ");
            num+=2;
        }
        num=100;//print odd num from 100 to 1
        System.out.println();//to see a new output on a new line
        while(num>=1){
            if(num%2==1){//it's as same as counter%2!=0
                System.out.print(num+" ");
            }num--;

        }
    }
}
