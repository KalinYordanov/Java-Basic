package feb2022;

import java.util.Scanner;

public class k03PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Сладкиш - текст - "Cake", "Souffle" или "Baklava"
        //Брой на поръчаните сладкиши - цяло число в интервала [1 … 10000]
        //Ден от месец декември преди Коледа - цяло число в интервала [1 … 24]
        String name = scanner.nextLine();
        int numberCake = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double discount = 0;
        double total = 0;
        double money = 0;
        switch (name) {
            case "Cake":
                if (days <= 15) {
                    price += 24;
                    money = price * numberCake;

                } else {
                    price += 28.70;
                    money = price * numberCake;
                }
                break;
            case "Souffle":
                if (days <= 15) {
                    price += 6.66;
                    money = price * numberCake;
                } else {
                    price += 9.80;
                    money = price * numberCake;
                }
                break;
            case "Baklava":
                if (days <= 15) {
                    price += 12.60;
                    money = price * numberCake;
                } else {
                    price += 16.98;
                    money = price * numberCake;
                }
                break;
            //До 22 декември включително съществуват следните отстъпки, които се прилагат в следния ред:
            //При поръчка от 100 лв. до 200 лв. -> 15% отстъпка
            //При поръчка над 200 лв. -> 25% отстъпка
            //До 15 декември включително -> 10% допълнителна отстъпка от крайната цена
        } total = money;
        if (days <= 22) {
            if (money >= 100 && money <= 200) {
                discount = money * 0.15;
                total = money - discount;
            } else if (money > 200) {
                discount = money * 0.25;
                total = money - discount;
            }
            if (days <= 15) {
                discount = total * 0.1;
                total -= discount;
            }


        }
        System.out.printf("%.2f", total);
    }
}
