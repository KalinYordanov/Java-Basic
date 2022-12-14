package Homework;
import java.util.Scanner;

public class k08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;
        double parameter = 2 * Math.PI *r;
        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", parameter);
    }
}
