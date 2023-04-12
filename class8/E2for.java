package class8;

import java.util.Scanner;

public class E2for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any num to start and end");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int number1 = start;
        while (number1 <= end) {
            System.out.println(number1 + " ");
            number1++;
        }
    }
}
