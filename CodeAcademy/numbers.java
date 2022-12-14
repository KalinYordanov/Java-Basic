package CodeAcademy;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int nine = firstNum % 10;
        int eight = firstNum / 10 % 10;
        int seven = firstNum / 100 % 10;
        int six = firstNum / 1000 % 10;
        int five = firstNum / 10000 % 10;
        int four = firstNum / 100000 % 10;
        int tree = firstNum / 1000000 % 10;
        int two = firstNum / 10000000 % 10;
        int one = firstNum / 100000000 % 10;
        System.out.printf("%d%d%d%d%d%d%d%d%d",nine,eight,seven,six,five,four,tree,two,one);

    }

}

