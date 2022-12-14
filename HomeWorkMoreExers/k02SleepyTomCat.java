package HomeWorkMoreExers;
import java.util.Scanner;

public class k02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int restDays = days * 127;
        int workDays = (365 - days) * 63;
        int allTime = restDays + workDays;
        int ollTime = 30000 - Math.abs(allTime);
        int hours = ollTime / 60;
        int minutes = ollTime % 60;
        if (30000 > allTime){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play" , hours , minutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", Math.abs(hours) , Math.abs(minutes));
        }
    }
}
