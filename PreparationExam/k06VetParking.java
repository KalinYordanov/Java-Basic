package PreparationExam;

import java.util.Scanner;

public class k06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 1; i <= days; i++) {
            double priceForDay = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    priceForDay += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    priceForDay += 1.25;
                } else {
                    priceForDay += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, priceForDay);
            totalPrice += priceForDay;
        }
        System.out.printf("Total: %.2f leva",totalPrice);
    }
}
