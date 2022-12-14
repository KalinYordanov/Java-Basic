package Preparation;

import java.util.Scanner;

public class k04Worksout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        double total = 0;
       double sum = 0;
        for (int i = 0; i <= n; i++) {
            double persents = Double.parseDouble(scanner.nextLine());

            total = m * (persents / 100.0);
            m += total;
            sum += m;


        }
        if (sum >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(sum - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - sum));
        }
    }
}
