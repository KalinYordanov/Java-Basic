package Preparation;

import java.util.Scanner;

public class k05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String bestPlayer = "";
        int maxGoal = 0;
        int totalGol = 0;
        while (!name.equals("END")) {
            int playerGoal = Integer.parseInt(scanner.nextLine());
            if (playerGoal > maxGoal) {
                maxGoal = playerGoal;
                bestPlayer = name;
            }
            if (maxGoal >= 10) {
                break;
            }
            name = scanner.nextLine();
        } System.out.printf("%s is the best player!%n",bestPlayer);
        if (maxGoal >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",maxGoal);
        } else {
            System.out.printf("He has scored %d goals.",maxGoal);
        }
    }
}
