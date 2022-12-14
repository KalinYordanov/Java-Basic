package lab;
import java.util.Scanner;
public class k09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meter = Double.parseDouble(scanner.nextLine());
        double priceMeter = meter * 7.61;
        double discount = priceMeter * 0.18;
        double all = priceMeter - discount;

        System.out.printf("The final price is: %f lv.", all);
        System.out.println();
        System.out.printf("The discount is: %f lv.", discount);


    }
}
