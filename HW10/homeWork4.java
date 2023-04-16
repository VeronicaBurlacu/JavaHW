package HW10;

public class homeWork4 {
    public static void main(String[] args) {
        String cars[]={"BMW","Mercedes","Ferrari","Ford","Fiat","Maseratti"};
        for(String car:cars){
            System.out.println(car);//first step
        }
        System.out.println();
        String mas []=new String[6];//second step
        mas[0]="BMW";
        mas[1]="Mercedes";
        mas[2]="Ferrari";
        mas[3]="Ford";
        mas[4]="Fiat";
        mas[5]="Maseratti";
        for(int a=0;a<mas.length;a++){
        System.out.println(mas[a]+" ");}
    }
}
