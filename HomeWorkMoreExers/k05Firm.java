package HomeWorkMoreExers;
import java.util.Scanner;

public class k05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeed = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workersNumber = Integer.parseInt(scanner.nextLine());
        double discount = days * 0.10;
        double allHours = (days - discount) * 8;
        double timeOut = workersNumber * (2 * days);
        double sumTime = timeOut + allHours;
        if (sumTime >= hoursNeed){
            System.out.printf("Yes!%.0f hours left.", Math.floor(sumTime - hoursNeed));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.ceil(hoursNeed - sumTime) );
        }

    }
}
