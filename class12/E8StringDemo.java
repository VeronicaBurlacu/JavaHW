package class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="   Java is very very easy";
        System.out.println(sentence.startsWith("Java"));//true // checked if java repeats and false bc of tha space


        String searchWord="Java";
        sentence=sentence.trim().toLowerCase();//called 2 methods in 1 line //method chaining and possible to string
        System.out.println(sentence);


    }
}
