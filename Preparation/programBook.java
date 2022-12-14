package Preparation;
import java.util.Scanner;
public class programBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pricePage = Double.parseDouble(scanner.nextLine());
        double priceCover = Double.parseDouble(scanner.nextLine());
        double percentageReduction = Double.parseDouble(scanner.nextLine());
        double priceFourWork = Double.parseDouble(scanner.nextLine());
        double priceOfWorkers = Double.parseDouble(scanner.nextLine());
      //  int page = 899;
      //  int cover = 2;
        double bookPrice = pricePage * 899 + priceCover * 2;
        double reduction = bookPrice - (bookPrice * percentageReduction / 100);
        double sumWork = reduction + priceFourWork;
        double workersSum = sumWork - (sumWork * priceOfWorkers / 100);
        System.out.printf("Avtonom should pay %.2f BGN.", workersSum);
    }
}
