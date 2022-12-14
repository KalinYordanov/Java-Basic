package HomeWorkMoreExers;
import java.util.Scanner;

public class k04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kiloMaters = Integer.parseInt(scanner.nextLine());
        String dayOurNight = scanner.nextLine();
        double taxiDay = kiloMaters * 0.79 + 0.70;
        double taxiNight = kiloMaters * 0.90 + 0.70;
        double busTax = 0.09 * kiloMaters;
        double trainTax = 0.06 * kiloMaters;

        if (kiloMaters < 20){
            if (dayOurNight.equals("day")){
                System.out.printf("%.2f", taxiDay);
            }
            else {
                System.out.printf("%.2f", taxiNight);
            }
        } else if (kiloMaters >= 20 && kiloMaters < 100){
            System.out.printf("%.2f\n", kiloMaters*0.09);

        } else  {
            System.out.printf("%.2f\n", kiloMaters * 0.06);
        }
    }
}
