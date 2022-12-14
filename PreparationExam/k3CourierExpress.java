package PreparationExam;

import java.util.Scanner;

public class k3CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Тегло на пратката в килограми – реално число в интервала [0.01 ... 150.00]
        //Тип услуга –  текст със следните възможности: "standard" или "express"
        //Разстояние в километри – цяло число в интервала [1 ... 1000]
        double kilogram = Double.parseDouble(scanner.nextLine());
        String deliveryTupe = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double total = 0;
        double markup = 0;
        double totalMarkup = 0;
        while (deliveryTupe.equals("standard")) {
            //За пратки по - леки от 1 кг – 3 стотинки на километър.
            //От 1 кг до 10 кг – 5 стотинки на километър.
            //От 10 кг вкл. до 40 кг – 10 стотинки на километър.
            //От 40 кг вкл. до 90  кг – 15 стотинки на километър.
            //От 90 кг вкл. до 150 кг – 20 стотинки на километър.
            if (kilogram < 1) {
                price += 0.03;
            } else if (kilogram >= 1 && kilogram < 10) {
                price += 0.05;
            } else if (kilogram >= 10 && kilogram < 40) {
                price += 0.10;
            } else if (kilogram >= 40 && kilogram < 90) {
                price += 0.15;
            } else if (kilogram >= 90 && kilogram < 150) {
                price += 0.20;
            }
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kilogram, price * distance);
            break;
        }
        //За пратки по - леки от 1 кг – на килограм по 80 % от съответната цена на километър
        //От 1 кг до 10  кг – на килограм по 40 % от съответната цена на километър
        //От 10 кг вкл. до 40 кг – на килограм по 5 % от съответната цена на километър
        //От 40 кг вкл. до 90  кг – на килограм по 2 % от съответната цена на километър
        //От 90 кг вкл. до 150 кг – на килограм по 1 % от съответната цена на километър
        //Напишете програма, която да пресмята при зададено разстояние в км. ,
        // тегло на пратката и вида услуга, каква ще бъде стойността за доставка на дадена пратка.

        while (deliveryTupe.equals("express")) {
            if (kilogram < 1) {
                price += 0.03 + (0.03 * 0.8);
            } else if (kilogram >= 1 && kilogram < 10) {
                price += 0.05;
                total += 0.05 * 0.4;
            } else if (kilogram >= 10 && kilogram < 40) {
                price += 0.10;
                total += 0.10 * 0.05;
            } else if (kilogram >= 40 && kilogram < 90) {
                price += 0.15;
                total += 0.15 * 0.02;
            } else if (kilogram >= 90 && kilogram < 150) {
                price += 0.20;
                total += 0.20 * 0.01;
            }
            markup = kilogram * total;
            totalMarkup = markup * distance;
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kilogram, price * distance + totalMarkup);
            break;
        }
    }
}
