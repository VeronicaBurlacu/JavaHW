package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="jhdshGKUFUYGUY!@#$%^&#$%^&";
        System.out.println(str.replaceAll("[^a-z]",""));
        //dont replace lower case letters from a-z and numbers -0-9
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        //fro spaces

        String str1="jhdshGKUFUYGUY              !@#$%^&#$%^&";
        System.out.println(str.replaceAll("   ","\\$"));
    }
}
