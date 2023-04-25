package class13;

public class E3Stringeasy {
    public static void main(String[] args) {
        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?
        String num="Is it saturday? Is is raining? Do we have a java class today?";
        String []num1=num.split("[.?!]");
        System.out.println(num1.length);


    }
}
