package CodeAcademy;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilograms = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double result = (kilograms / height / height) * 10000;
        System.out.printf("%f%n",result);
        if (kilograms > 80){
            System.out.printf("more training, less eating");
        }else {
            System.out.printf("you rock!");
        }




    }
}
