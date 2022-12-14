package PreparationExam;
import java.util.Scanner;

public class k02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int numberLoveMas = Integer.parseInt(scanner.nextLine());
        int numberRose = Integer.parseInt(scanner.nextLine());
        int numberKey = Integer.parseInt(scanner.nextLine());
        int numberCartoon = Integer.parseInt(scanner.nextLine());
        int numberGoodLuck = Integer.parseInt(scanner.nextLine());
        //Любовно послание - 0.60 лв.
        //Восъчна роза - 7.20 лв.
        //Ключодържател - 3.60 лв.
        //Карикатура - 18.20 лв.
        //Късмет изненада - 22 лв.
        double loveMasPrice = numberLoveMas * 0.60;
        double rosePrice = numberRose * 7.20;
        double keyPrice = numberKey * 3.60;
        double cartoonPrice = numberCartoon * 18.20;
        double goodLuckPrice = numberGoodLuck * 22;
        double totalPrice = loveMasPrice + rosePrice + keyPrice + cartoonPrice + goodLuckPrice;
        int totalNumbers = numberCartoon + numberKey + numberLoveMas + numberRose + numberGoodLuck;
        if (totalNumbers >= 25) {
            totalPrice = totalPrice - (totalPrice * 0.35);
        }
        double hostPrice = totalPrice * 0.10;
        double total = totalPrice - hostPrice;
        if (total > partyPrice){
            System.out.printf("Yes! %.2f lv left.",total - partyPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",partyPrice - total);
        }

    }
}
