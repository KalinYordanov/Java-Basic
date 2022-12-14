package lab;
import java.util.Scanner;

public class k02RectagleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int rectagleArea = a * b;
        System.out.println(rectagleArea);
    }
}
