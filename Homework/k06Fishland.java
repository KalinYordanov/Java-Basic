package Homework;
import java.util.Scanner;

public class k06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //⦁	Паламуд – 60% по-скъп от скумрията
        //⦁	Сафрид – 80% по-скъп от цацата
        //⦁	Миди – 7.50 лв. за килограм

        //От конзолата се четат 5 числа:
        //⦁	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        //⦁	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        //⦁	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        //⦁	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        //⦁	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]
        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kilogramPalamud = Double.parseDouble(scanner.nextLine());
        double kilogramSafrid = Double.parseDouble(scanner.nextLine());
        double kilogramMussels = Double.parseDouble(scanner.nextLine());



    }
}
