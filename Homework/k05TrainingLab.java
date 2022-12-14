package Homework;
import java.util.Scanner;

public class k05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.next());
        double h = Double.parseDouble(scanner.next());
        w = w * 100;
        h = h * 100;
        h = h - 100;

        double desk = Math.floor(h / 70);
        double rows = Math.floor(w / 120);
        double allDesks = desk * rows;
        allDesks = allDesks - 3;
        System.out.printf("%.0f", allDesks);
    }
}
