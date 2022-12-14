package HomeWorkMoreExers;
import java.util.Scanner;

public class k03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workersNumber = Integer.parseInt(scanner.nextLine());

        double allGrapes = x * y;
        double wine = (0.4 * allGrapes)/2.5;
         if (wine >= z) {
             System.out.printf("Good harvest this year! Total wine: %.0f liters. ", Math.floor(wine));
            double wineAll = Math.ceil(wine - z);
            double wineFourWorker = Math.ceil(wineAll / workersNumber);
             System.out.println();

             System.out.printf("%.0f liters left -> %.0f liters per person." , wineAll , Math.ceil(wineFourWorker));

         } else {
             double result = Math.floor(z - wine);
             System.out.printf("It will be a tough winter! More %.0f liters wine needed.", result);
         }
    }
}
