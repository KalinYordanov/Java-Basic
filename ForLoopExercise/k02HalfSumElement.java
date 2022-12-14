package ForLoopExercise;
import java.util.Scanner;
public class k02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1 ; i <= n ; i ++){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber){
                maxNumber = number;
            }}
        int sumWithOut = sum - maxNumber;
        if (maxNumber == sumWithOut){

            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithOut);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumber - sumWithOut));
        }
    }
}
