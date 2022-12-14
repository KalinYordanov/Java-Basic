package feb2022;

import java.util.Scanner;

public class k06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLocation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberLocation; i++) {
            double totalGold = 0;
            double realPrice = 0;
            double goldPerDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= days; j++){
                double gettGold = Double.parseDouble(scanner.nextLine());
                totalGold += gettGold;
            }
            //Ден 1: добиват 10 килограма
            //      Ден 2: добиват 10 килограма
            //      Ден 3: добиват 11 килограма
            //      Средният добив е (10 + 10 + 11) / 3 = 10.33 кг.
            realPrice = totalGold / days;
            if (realPrice >= goldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", realPrice);

            }else {
                System.out.printf("You need %.2f gold.%n", goldPerDay - realPrice);

            }

        }
    }
}
