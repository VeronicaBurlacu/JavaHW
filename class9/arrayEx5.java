package class9;

public class arrayEx5 {
    public static void main(String[] args) {
        //createan arr store n 10,1
        int [] numb={10,50,60,45,100};
        for (int i = 0; i < numb.length; i++) {

            if(i%2!=0)
            System.out.println(numb[i]+" ");

        }
    }
}
