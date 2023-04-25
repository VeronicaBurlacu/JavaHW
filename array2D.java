public class array2D {
    public static void main(String[] args) {

        String[][]cars={{"Ford","Lincoln","Dodge"},//index 0
                        {"BMW","Audi","Mercedes","VW","Fiat"},
                       {"Honda","Toyota","Subaru","Nissan"}

        };
        System.out.println(cars[1][1]);
        for (String[] car : cars) {
            for (String s : car) {
                System.out.print(car+" ");

            }

        }
    }
}
