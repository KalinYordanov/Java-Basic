package feb2022;

import java.util.Scanner;

public class k02ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Първи ред – броят процесори, които трябва да се изработят – цяло число в интервала [1...500 000]
        //Втори ред – броят служители – цяло число в интервала [1...1000]
        //Трети ред – работните дни – цяло число в интервала [1...1000]
        //Пример: за 10 часа се изработват 10/3 = 3.33 процесора   3 процесора. Един брой струва 110.10 лв.
        // Според количеството изработени процесори принтирайте на конзолата, колко повече или по-малко пари са изкарани от плануваното.
        int numberOfProcessors = Integer.parseInt(scanner.nextLine());
        int workersNumber = Integer.parseInt(scanner.nextLine());
        int daysWork = Integer.parseInt(scanner.nextLine());
        int hoursAllWorking = workersNumber * daysWork * 8;
        double processors = Math.floor(hoursAllWorking / 3.0);
        double total = 0;
        double money = 0;
        if (numberOfProcessors > processors) {
            total = numberOfProcessors - processors;
            money = total * 110.10;
            System.out.printf("Losses: -> %.2f BGN", money);
        } else {
            total = processors - numberOfProcessors;
            money = total * 110.10;
            System.out.printf("Profit: -> %.2f BGN", money);

        }
    }
}
