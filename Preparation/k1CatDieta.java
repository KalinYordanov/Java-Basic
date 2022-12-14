package Preparation;

import java.util.Scanner;

public class k1CatDieta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///Процент на мазнините - цяло число в интервала [0…100]
        // Процент на протеините - цяло число в интервала [0…100]
        // Процент на въглехидратите - цяло число в интервала [0…100]
        // Общ брой калории - цяло число в интервала [1000…15000]
        // Процент на съдържанието на вода - цяло число в интервала [0…100]
        double fatPercent = Double.parseDouble(scanner.nextLine());
        double proteinPercent = Double.parseDouble(scanner.nextLine());
        double carbohydratesPercent = Double.parseDouble(scanner.nextLine());
        double calories = Double.parseDouble(scanner.nextLine());
        double waterPercent = Double.parseDouble(scanner.nextLine());
        // 1 грам мазнини = 9 калории
        // 1 грам протеини = 4 калории
        // 1 грам въглехидрати = 4 калории
        double totalFat = calories * (fatPercent / 100) / 9;
        double totalProtein = calories * (proteinPercent / 100) / 4;
        double totalCarbohydrates = calories * (carbohydratesPercent / 100) / 4;
        double totalSum = totalCarbohydrates + totalFat + totalProtein;
        double oneGramFood = calories / totalSum;
        double totalPerset = (100 - waterPercent) / 100;
        double totalAll = totalPerset * oneGramFood;
        //(60 % от 2500) / 9 = 166.6 - общите грамове от мазнини
        //(25 % от 2500) / 4 = 156.25 - общите грамове от протеини
        //(15 % от 2500) / 4 = 93.75 - общите грамове от въглехидрати
        // Теглото на храната = 166.6 + 156.25 + 93.75 = 416.6 грама
        // Калории за един грам храна = 2500 / 416.6 = 6 калории
        //60
        //25
        //15
        //2500
        //60
        System.out.printf("%.4f",totalAll);
    }
}
