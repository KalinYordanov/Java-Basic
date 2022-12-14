package feb2022;

import java.util.Scanner;

public class k05ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();

        int priceToys = 5;
        int priceDress = 15;
        int numberOfCha = 0;
        int numberOfBig = 0;
        while (!age.equals("Christmas")) {
            double agesOf = Double.parseDouble(age);

            //Number of adults: 4
            //Number of kids:
            //Всички до 16 (вкл.) години се считат за деца и ще получат играчка
            //Всички над 16 години се считат за възрастни и ще получат коледен пуловер
            //Цената на всяка играчка е 5 лв., а цената на един пуловер е 15 лв.
            if (agesOf <= 16) {
                numberOfCha++;
            }else {
                numberOfBig++;
            }

            age = scanner.nextLine();
        }
        int totalToys = priceToys * numberOfCha;
        int totalSweaters = priceDress * numberOfBig;
        System.out.printf("Number of adults: %d%n",numberOfBig);
        System.out.printf("Number of kids: %d%n",numberOfCha);
        System.out.printf("Money for toys: %d%n",totalToys);
        System.out.printf("Money for sweaters: %d%n",totalSweaters);
    }
}
