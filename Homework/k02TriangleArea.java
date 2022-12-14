package Homework;
import java.util.Scanner;

public class k02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f\n",a * h/2);
    }
}
