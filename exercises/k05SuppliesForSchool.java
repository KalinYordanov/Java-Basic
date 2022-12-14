package exercises;
import java.util.Scanner;

public class k05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //⦁	Пакет химикали - 5.80 лв.
        //⦁	Пакет маркери - 7.20 лв.
        //⦁	Препарат - 1.20 лв (за литър)
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int prosOff = Integer.parseInt(scanner.nextLine());
        double pacPens = pens * 5.8;
        double pacMarkers = markers * 7.2;
        double pacDetergent = detergent * 1.2;
        double allPrice = pacDetergent + pacPens + pacMarkers;
        double theSum = allPrice - (allPrice * prosOff / 100);
        System.out.println(theSum);





    }
}
