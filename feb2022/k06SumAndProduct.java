package feb2022;

import java.util.Scanner;

public class k06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int a = n; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int totalPlus = a + b + c + d;
                        int total = a * b * c * d;
                        if (total == totalPlus) {


                        }
                        if (n % 10 == 5){
                            System.out.printf("%d%d%d%d", a, b, c, d);
                        }
                    }
                }
            }
        }
    }
}
