package CodeAcademy;
import java.util.Scanner;

public class numberx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
       double result = number * number;
        System.out.printf("%.5f",number);
    }
}
