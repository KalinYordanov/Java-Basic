package PreparationExam;

import java.util.Scanner;

public class k01incomeMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameMovie = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double sumForOneDay = tickets * priceTicket;
        double totalIncome = sumForOneDay * day;
        totalIncome = totalIncome * ((100 - percent) / 100.0);
        System.out.printf("The profit from the movie %s is %.2f lv.", nameMovie , totalIncome);
    }
}
