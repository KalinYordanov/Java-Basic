package Preparation;

import java.util.Scanner;

public class k03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        boolean isFoundC = false;
        boolean isFoundO = false;
        boolean isFoundN = false;
        String word = "";
        while (!command.equals("End")) {
            char letter = command.charAt(0);

            if (letter < 'A' || (letter > 'Z' && letter < 'a') || letter > 'z') {
                command = scanner.nextLine();
                continue;
            }

            if ("c".equals(command) && !isFoundC) {
                isFoundC = true;
            } else if ("o".equals(command) && !isFoundO) {
                isFoundO = true;
            } else if ("n".equals(command) && !isFoundN) {
                isFoundN = true;
            } else {
                word += command;
            }
            if (isFoundC && isFoundN && isFoundO) {
                isFoundC = false;
                isFoundO = false;
                isFoundN = false;
                System.out.print(word + " ");
                word = "";
            }
            command = scanner.nextLine();
        }
    }
}
