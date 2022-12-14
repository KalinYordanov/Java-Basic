package Preparation;

import java.util.Scanner;

public class k04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        //За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        int students = Integer.parseInt(scanner.nextLine());
        double cost1 = 0;
        double cost2 = 0;
        double cost3 = 0;
        double cost4 = 0;
        double avarege = 0;
        for (int i = 1; i <= students; i++) {
            double studentEvala = Double.parseDouble(scanner.nextLine());
            avarege += studentEvala;
            if (studentEvala >= 2 && studentEvala < 3) {
                cost1++;
            } else if (studentEvala >= 3 && studentEvala < 4) {
                cost2++;
            } else if (studentEvala >= 4 && studentEvala < 5) {
                cost3++;
            } else if (studentEvala >= 5) {
                cost4++;
            }


//На края програмата трябва да отпечата процента студенти с оценка между
            // 2.00 и 2.99, между 3.00 и 3.99, между 4.00 и 4.99, 5.00 или повече.
        }

        System.out.printf("Top students: %.2f%%%n", (cost4 / students) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (cost3 / students) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (cost2 / students) * 100);
        System.out.printf("Fail: %.2f%%%n", (cost1 / students) * 100);
        System.out.printf("Average: %.2f", avarege / students);
    }

}
