package exercises;
import java.util.Scanner;

public class k04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookList = Integer.parseInt(scanner.nextLine());
        int listFour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        // Общо време за четене на книгата: 212 страници / 20 страници за час = 10 часа общо
        //Необходимите часове на ден: 10 часа / 2 дни = 5 часа на ден
        int timeFourRead = bookList / listFour;
        int timePerDay = timeFourRead / days ;
        System.out.println(timePerDay);
    }
}
