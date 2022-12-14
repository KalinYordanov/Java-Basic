package Preparation;

import java.util.Scanner;

public class k02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int night = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        if (night > 7) {
            pricePerNight = pricePerNight - pricePerNight * 0.05;
        }
        double totalPrice = night * pricePerNight;
        budget = budget - budget * percent / 100;
        if (budget >= totalPrice){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - totalPrice);
        }else {
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }
    }
}
