package HW11;

public class twoArray2 {
    public static void main(String[] args) {
        // Create 2D array of cars : american, german, korean, italian.
        //Then retrieve all values from that array using 2 different loops
        String[][] cars = {
                {"Lincoln","Nissan","GMC","Tesla","Ford"},
                { "Mercedes","BMW","Audi","Volkswagen","Porsche"},
                {"Hyundai","Genesis","Kia","Hyundai","kia"},
                {"Alfa Romeo","Lancia","Fiat","Ferarri","Lamborgini"}
        };

        for (int i = 0; i < 4; i++) {
           String []store= cars[i];
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);

            }

        }

            }

        }













