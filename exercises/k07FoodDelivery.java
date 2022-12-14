package exercises;
import java.util.Scanner;

public class k07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberCh = Integer.parseInt(scanner.nextLine());
        int numberFish = Integer.parseInt(scanner.nextLine());
        int numberVegan = Integer.parseInt(scanner.nextLine());
        double priceCh = numberCh * 10.35;
        double priceFish = numberFish * 12.40;
        double priceVegan = numberVegan * 8.15;
        double allPriceMenu = priceFish + priceCh + priceVegan;
        double desert = allPriceMenu * 0.2;
        double delivery = 2.5;
        double sum = allPriceMenu + desert + delivery;
        System.out.println(sum);




    }
}
