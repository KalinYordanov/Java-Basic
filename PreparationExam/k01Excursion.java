package PreparationExam;
import java.util.Scanner;

public class k01Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Броят на хората в групата – цяло число в интервала [0 … 50]
        //Броят на нощувките – цяло число в интервала [0 … 2000]
        //Броят на картите за транспорт – цяло число в интервала [0… 2000]
        //Броят на билетите за музеи – цяло число в интервала [0 … 2000]
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        int nightsNumber = Integer.parseInt(scanner.nextLine());
        int numberCards = Integer.parseInt(scanner.nextLine());
        int numberTickets = Integer.parseInt(scanner.nextLine());
        //Нощувка - 20 лв.
        //Карта за транспорт - 1.60 лв.
        //Билет за музей - 6 лв.
        int priceNight = 20;
        double ticketPrice = 1.60;
        int museyTicket = 6;
        //Изчисляваме сумата, която се заплаща от един човек:
        //Нощувки: 14 * 20 = 280 лв.
        //Карти за транспорт: 30 * 1.60 =  48 лв.
        //Билети за музеи: 6 * 6 = 36 лв.
        //Обща сума за един човек от групата: 280 + 48 + 36 =  364 лв.
        //Сума за цялата група: 364 * 20 = 7280 лв.
        //Сума след добавяне на непредвидените разходи: 7280 + 25% = 9100 лв.
        int totalNight = nightsNumber * priceNight;
        double totalCards = ticketPrice * numberCards;
        int totalMus = museyTicket * numberTickets;
        double sumForOne = totalMus + totalNight + totalCards;
        double sumForAll = sumForOne * peopleNumber;
        double total = sumForAll + (sumForAll * 0.25);
        System.out.printf("%.2f",total);
    }
}
