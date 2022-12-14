package exercises;
import java.util.Scanner;

public class k06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //⦁	Предпазен найлон - 1.50 лв. за кв. метър
        //⦁	Боя - 14.50 лв. за литър
        //⦁	Разредител за боя - 5.00 лв. за литър
        //Входът се чете от конзолата и съдържа точно 4 реда:
        //⦁	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //⦁	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //⦁	Количество разредител (в литри) - цяло число в интервала [1…30]
        //⦁	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        int nylon = Integer.parseInt(scanner.nextLine());
        int painte = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int ourToWork = Integer.parseInt(scanner.nextLine());
        double priceNaylon = (nylon + 2 ) * 1.5;
        double pricePainte = (painte + painte * 0.10) * 14.5;
        double priceThinner = thinner * 5;
        double allSum = pricePainte + priceNaylon + priceThinner + 0.4;
        double priceWork = (allSum * 0.3) * ourToWork;
        double theSum = priceWork + allSum;
        System.out.println(theSum);

    }
}
