package class9;

public class ArrayEx6 {
    public static void main(String[] args) {
        boolean[] flags={true,false,true,false,false,true};
        int num=0;

        for (int i = 0; i < flags.length; i++) {
            if(flags[i]==false){
                num++;
            }
        }
        System.out.println(num);
        }
    }

