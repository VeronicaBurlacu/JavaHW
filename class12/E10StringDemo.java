package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name="LEANDROR";
     //count how many times the letter r appears
        int count=0;
        System.out.println(name.charAt(1));
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='R'){
                count++;
            }

            
        }
        System.out.println(count);
    }
}
