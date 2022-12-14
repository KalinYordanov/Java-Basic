package PreparationExam;
import java.util.Scanner;
public class k02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Време за снимки – цяло число в диапазона [0… 1440]
        //Брой сцени  – цяло число в диапазона [5… 25]
        //Времетраене на сцена – цяло число в диапазона [20… 90]
        int timeToFot = Integer.parseInt(scanner.nextLine());
        int movieAction = Integer.parseInt(scanner.nextLine());
        int timeAction = Integer.parseInt(scanner.nextLine());
        double prepare = timeToFot * 0.15;
        int totalTime = movieAction * timeAction;
        double total = totalTime + prepare;

        if (timeToFot <= total){
            System.out.printf("Time is up! To complete the movie you need %d minutes.",Math.round(total - timeToFot));
        }else if (total < timeToFot){
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(timeToFot- total));

        }
    }
}
