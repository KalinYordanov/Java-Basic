package ConditionalStatemantsExercise;
import java.util.Scanner;

public class k08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //⦁	Име на сериал – текст
        //⦁	Продължителност на епизод  – цяло число в диапазона [10… 90]
        //⦁	Продължителност на почивката  – цяло число в диапазона [10… 120]
        String movieName = scanner.nextLine();
        int movieMinutes = Integer.parseInt(scanner.nextLine());
        int breakOff = Integer.parseInt(scanner.nextLine());
        //По време на обедната почивка искате да изгледате епизод от своя любим сериал.
        // Вашата задача е да напишете програма, с която ще разберете дали имате достатъчно време да изгледате епизода.
        // По време на почивката отделяте време за обяд и време за отдих.
        // Времето за обяд ще бъде 1/8 от времето за почивка, а времето за отдих ще бъде 1/4 от времето за почивка.
        double breakTime = breakOff * 0.125;
        double lunchTime = breakOff * 0.25;
        double restTime = breakOff - breakTime - lunchTime;


            if (restTime >= movieMinutes){
                System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName , Math.ceil(restTime - movieMinutes));
            } else {
                System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes." , movieName , Math.ceil(movieMinutes - restTime));

            }

    }
}
