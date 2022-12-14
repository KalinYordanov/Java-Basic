package Homework;
import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String weekday = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        double totalPrice= 0.0;

        if(weekday.equals("Monday")||  weekday.equals("Tuesday")||
                weekday.equals("Wednesday")|| weekday.equals("Thursday")||
                weekday.equals("Friday")) {
            switch (product) {
                case "banana":
                    price = 2.50;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "apple":
                    price = 1.20;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "orange":
                    price = 0.85;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "grapefruit":
                    price = 1.45;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "kiwi":
                    price = 2.70;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "pineapple":
                    price = 5.50;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "grapes":
                    price = 3.85;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;

                    default:
                        System.out.println("error");
                    break;


            }
        } else if (weekday.equals("Saturday") ||  weekday.equals("Sunday")) {
            switch (product) {
                case "banana":
                    price = 2.70;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "apple":
                    price = 1.25;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "orange":
                    price = 0.90;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "grapefruit":
                    price = 1.60;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "kiwi":
                    price = 3.00;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "pineapple":
                    price = 5.60;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;
                case "grapes":
                    price = 4.20;
                    totalPrice = quantity * price;
                    System.out.printf("%.2f",totalPrice);
                    break;

                default:
                    System.out.println("error");
                    break;
            }


        } else {
            System.out.println("error");
        }
    }
}
