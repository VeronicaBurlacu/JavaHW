package class13;

public class E5StringModel {
    public static void main(String[] args) {
       // Create a String that will hold a sentence.
        // Write a program to get a new String without any spaces.
        String n="   Asghar is the best teacher ever. but his classes are so hard.    we need more time ";
        String[] strArr=n.split("[.]");
        System.out.println(n.length());
        System.out.println(strArr[1].trim());
    }
}
