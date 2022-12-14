package feb2022;
import java.util.Scanner;
public class k01MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceCard = Integer.parseInt(scanner.nextLine());
        int priceAdapter = Integer.parseInt(scanner.nextLine());
        double priceConsumption = Double.parseDouble(scanner.nextLine());
        double winByOneCard = Double.parseDouble(scanner.nextLine());
        int totalPriceCards = priceCard * 13;
        int totalPriceAdapter = priceAdapter * 13;
        int totalMoney = totalPriceAdapter + totalPriceCards + 1000;
        double totalWin = winByOneCard - priceConsumption;
        double totalWinByAll = totalWin * 13;
        double totalDaysFourBackMoney =Math.ceil(totalMoney / totalWinByAll) ;
        System.out.println(totalMoney);
        System.out.printf("%.0f",totalDaysFourBackMoney);

    }
}
