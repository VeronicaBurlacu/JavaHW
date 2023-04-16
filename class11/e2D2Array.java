package class11;

public class e2D2Array {
    public static void main(String[] args) {
        String [][] names={
                {"sarah","Artem","lean","semir"},
                {"Farwa","Halima","Alina","Semira"}

        };
        for (int i = 0; i <names.length ; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);

            }
            System.out.println();
        }
        //the same result with enhanced loop
        for (String[] name : names) {
            for (String nam:name){
                System.out.println(nam);

            }
            System.out.println();
        }


    }
}
