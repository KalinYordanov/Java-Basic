package NestedLoopsExercise;
import java.util.Scanner;
public class k02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        for (int i = firstNum ; i <= secondNum ; i++){

            int currentNumber = i;
            int evenSum = 0;
            int oddSum =0;
            for (int j = 6; j >= 0; j--){
                int digit = currentNumber % 10;
                if ( j % 2 ==0){
                    evenSum+=digit;
                }else {
                    oddSum+=digit;
                }
                currentNumber = currentNumber / 10;
            }
            if (evenSum == oddSum){
                System.out.print(i + " ");
            }
        }
    }
}
