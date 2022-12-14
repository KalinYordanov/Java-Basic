package Homework;
import java.util.Scanner;

public class k07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която да пресмята колко литра боя е нужна за боядисването на къщa.
        // Като за стените се използва зелена боя, а за покрива – червена.
        // Разхода на зелената боя е 1 литър за 3.4 м2, а на червената – 1 литър за 4.3 м2.
        //Стените имат следните размери:
        //⦁	Предната и задната стена са квадрати със страна „x“
        //⦁	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
        //Страничните стени са правоъгълници със страни „x“ и „y“
        //⦁	и на двете странични стени има по един квадратен прозорец със страна 1.5м
        //Покривът има следните размери:
        //⦁	Два правоъгълника със страни „x“ и „y“
        //⦁	Два равностранни триъгълника със страна „x“ и височина „h“
        //Трябва да пресметнете площта на всички страни и площта на покрива, за да
        //намерите колко литра от всяка боя ще са нужни.
        //Изход
        //Да се отпечатат на конзолата две числа всяко на нов ред:
        //⦁	Литрите зелена боя
        //⦁	Литритe червена боя
        //Форматирани до вторият знак след десетичната запетая.
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double allSideWall = 2 * sideWall - 2 * window;
        double backWall = x * x;
        double enter = 1.2 * 2;
        double frontAndRear = 2 * backWall - enter;
        double allArea = allSideWall + frontAndRear;
        double greenColor = allArea / 3.4;
        double covers = 2 * (x * y);
        double coversArea = 2 * (x * h / 2);
        double coversAll = covers + coversArea;
        double redColor = coversAll / 4.3;
        System.out.printf("%.2f",greenColor);
        System.out.println();
        System.out.printf("%.2f", redColor);

    }
}
