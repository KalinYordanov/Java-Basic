package Homework;
import java.util.Scanner;

public class k03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double gradusC = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f \n", gradusC * 9/5 + 32 );
    }
}
