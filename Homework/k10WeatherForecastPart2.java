package Homework;
import java.util.Scanner;

public class k10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsey = Double.parseDouble(scanner.nextLine());
        if (celsey >= 5 && celsey < 12) {
            System.out.printf("Cold");
        } else if (celsey >= 12 && celsey < 15) {
            System.out.printf("Cool");
        } else if (celsey >= 15 && celsey <= 20) {
            System.out.printf("Mild");
        } else if (celsey > 20 && celsey < 26) {
            System.out.printf("Warm");
        } else if (celsey >= 26 && celsey <=35) {
            System.out.printf("Hot");
        } else {
            System.out.printf("unknown");
        }
    }
}
