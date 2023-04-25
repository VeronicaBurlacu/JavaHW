package class13;

public class E6Stringtest {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        String num="sjhf87780HFKDGIUG@#%$#$";
        String num1=num.replaceAll("[^a-zA-Z0-9]","");
       // System.out.println(num.replaceAll("[^a-zA-Z]","").length());
        //this is a shorter way
        System.out.println(num1);
        System.out.println(num1.length());


    }
}
