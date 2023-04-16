package HW10;

public class homeWork5 {
    public static void main(String[] args) {
        String animals []={"Cat","dog","bird","bunny","pork"};//first step
        for(int e=0;e<animals.length;e++){
            System.out.println(animals[e]+" ");
        }
        System.out.println();//second step
        for(String animal:animals){
            System.out.println(animal);
        }

    }
}
