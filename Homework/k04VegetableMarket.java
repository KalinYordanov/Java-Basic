package Homework;
import java.util.Scanner;

public class k04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetable = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int kilogramVegetable = Integer.parseInt(scanner.nextLine());
        int kilogramFruit = Integer.parseInt(scanner.nextLine());
        double allVegetable = priceVegetable * kilogramVegetable ;
        double allFruit = priceFruit * kilogramFruit;
        System.out.printf("%.2f \n", (allFruit + allVegetable) / 1.94);
    }
}
