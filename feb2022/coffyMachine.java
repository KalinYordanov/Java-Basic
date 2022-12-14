package feb2022;
import java.util.Scanner;
public class coffyMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int cups = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (drink) {
            case "Espresso":
                if ("Without".equals(sugar)) {
                    price = price + 0.90 * cups;
                    price = price * 0.65;
                } else if ("Normal".equals(sugar)) {
                    price = price + 1.00 * cups;
                } else if ("Extra".equals(sugar)) {
                    price = price + 1.20 * cups;
                }
                if (price >= 5) {
                    price = price * 0.75;
                }
                break;
        }
    }}
