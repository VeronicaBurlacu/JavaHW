package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr={10,20,45,98};
        int[] arr1={12,32,455,889};
        int num=100;
        int num1=10;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==num){
                System.out.println("wrong");
            }else{
                System.out.println("falseee");
            }

        }
        for (int j = 0; j < arr1.length; j++) {
            if(arr1[j]==num1){
                System.out.println("c");
            }else{
                System.out.println("nope");
            }

        }
    }
}
