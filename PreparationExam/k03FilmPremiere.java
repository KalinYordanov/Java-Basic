package PreparationExam;

import java.util.Scanner;

public class k03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String pack = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (movieName) {
            case "John Wick":
                if (pack.equals("Drink")) {
                    price += 12;
                } else if (pack.equals("Popcorn")) {
                    price += 15;
                } else if (pack.equals("Menu")) {
                    price += 19;
                }
                break;
            case "Star Wars":

                if (pack.equals("Drink")) {
                    price += 18;
                } else if (pack.equals("Popcorn")) {
                    price += 25;
                } else if (pack.equals("Menu")) {
                    price += 30;
                }
                if (numberTickets >= 4) {
                    price = price - (price * 0.30);
                }
                break;
            case "Jumanji":
                if (pack.equals("Drink")) {
                    price += 9;
                } else if (pack.equals("Popcorn")) {
                    price += 11;
                } else if (pack.equals("Menu")) {
                    price += 14;
                }
                if (numberTickets == 2){
                    price = price - (price * 0.15);
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.",price * numberTickets);

    }
}
