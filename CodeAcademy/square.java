package CodeAcademy;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int current = 1;
        for (int rows = 1; rows <= a; rows++) {

            for (int cols = 1; cols <= b; cols++) {

                System.out.print("# ");
                current++;

            }
            System.out.println();
        }


    }

    }

