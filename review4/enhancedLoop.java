package review4;

public class enhancedLoop {
    public static void main(String[] args) {
        //enhanced loops is used ONLY with array and collections
        String[] planets={"earth","mars","Jupiter","Saturn","Neptune"};
        for (String planet : planets) {//the collection will be repeated one by one(reprezinta each element)
            System.out.println(planet);//va fi primtat tot ce este inauntru
            
        }
        System.out.println("--------------------");
        for (int i = 0; i < planets.length; i++) {
            System.out.print(planets[i]+" ");

        }
    }
}
