package ConditionalStatemantsExercise;
import java.util.Scanner;

public class k01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());
        int all = f + s + t;
        int min = all / 60;
        int sec = all % 60;
        if (sec < 10){
            System.out.printf("%d:0%d", min , sec);
        } else {
            System.out.printf("%d:%d", min , sec);
        }
    }
}
