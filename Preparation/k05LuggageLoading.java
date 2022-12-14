package Preparation;

import java.util.Scanner;

public class k05LuggageLoading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        double suitcaseVolume = 0;
        int count = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double volume = Double.parseDouble(input);
            count++;
            if (count % 3 != 0) {
                suitcaseVolume += volume;
            } else {
                suitcaseVolume += (volume + (volume * 0.1));
            }
            if (capacity < suitcaseVolume) {
                count--;
                break;
            }
            input = scanner.nextLine();
        }
        if (capacity < suitcaseVolume) {
            System.out.printf("No more space!%n");
            System.out.printf("Statistic: %d suitcases loaded.", count);
        } else {
            System.out.printf("Congratulations! All suitcases are loaded!%n");
            System.out.printf("Statistic: %d suitcases loaded.", count);
        }
    }

}

