package class12;

public class E6StringDemo {
    public static void main(String[] args) {
        String name="Justin";
        System.out.println(name.equals("Axel"));//check if the name is equal//false
        System.out.println(name.equals("Justin"));//true
        System.out.println(name.equalsIgnoreCase("JUSTIN"));//true
        System.out.println(!name.equalsIgnoreCase("JUSTIN"));//not equal to// false the result
    }

}
