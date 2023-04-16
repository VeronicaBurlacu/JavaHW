package HW11;

public class threeHomeWork2D {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
        String[][] groceryList = {
                {"Salad", "Cucumber", "Tomato"},
                {"Mango", "Apple",},
                {"Milk", "Yogurt", "Sour cream"},
                {"Chocolates", "Ferrerro", "Bounty"}
        };
        for (int i = 0; i < groceryList.length; i++) {
            String[] store = groceryList[i];
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.println(groceryList[i][j]);
            }

        }
    }
}