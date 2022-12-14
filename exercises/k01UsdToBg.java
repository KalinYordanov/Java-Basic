package exercises;
import java.util.Scanner;

public class k01UsdToBg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.next());
        double bg = usd * 1.79549;
        System.out.println(bg);
    }
}
