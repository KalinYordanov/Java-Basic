package exercises;
import java.util.Scanner;

public class k03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double prise = Double.parseDouble(scanner.nextLine());
        int mounds = Integer.parseInt(scanner.nextLine());
        double interestYear = Double.parseDouble(scanner.nextLine());
        double interest = prise * (interestYear / 100);
        double oneInterest = interest / 12;
        double allSum = prise + mounds * oneInterest;

        System.out.println(allSum);
    }
}
