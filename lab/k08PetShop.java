package lab;

import java.util.Scanner;

public class k08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //⦁	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        //⦁	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]
        int packageDogFood = Integer.parseInt(scanner.nextLine());
        int packageCatFood = Integer.parseInt(scanner.nextLine());
        double dogFood = packageDogFood * 2.5;
        double catFood = packageCatFood * 4;

        double allSum = catFood + dogFood;

        System.out.println(allSum);

    }
}
