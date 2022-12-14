package HomeWorkMoreExers;
import java.util.Scanner;


public class k01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double firstP = H * P1;
        double secundP = H * P2;
        double allP = firstP + secundP;
        double firstPipe = firstP * 100/allP;
        double secondPipe = secundP * 100/allP;
        double allWater = allP * 100/ V;
        if (allWater <= 100){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", allWater , firstPipe , secondPipe);

        } else {

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H , allP - V);

        }

    }
}