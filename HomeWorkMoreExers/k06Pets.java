package HomeWorkMoreExers;
import java.util.Scanner;

public class k06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Марина обича да пътува.
        // Тя има 3 домашни любимеца (куче, котка и костенурка).
        // Когато заминава на пътешествие трябва да съобрази колко храна да им остави, за да не останат гладни.
        // Напишете програма, която пресмята колко килограма храна ще изядат всички за времето,
        // в което Марина отсъства и дали оставената храна от нея ще им е достатъчна.
        // Всяко животно изяжда определено количество храна на ден.
        int days = Integer.parseInt(scanner.nextLine());
        int foodKilo = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());
        double result = 0.0;
        //Нужна храна за: куче = 2 дена * 1 кг = 2кг;
        //                              котка = 2 дена * 1 кг = 2 кг;
        //                   костенурка = 2 дена * 1200 грама = 2.4 кг;
        //Общо храна = 2 + 2 + 2.4 = 6.4;
        //6.4 < 10 => 10 - 6.4 = 3.6 -> 3 кг. храна остават
        double allDogFood = days * dogFood;
        double allCatFood = days * catFood;
        double allTurtle = (days * turtleFood) / 1000;
        double allFood = allCatFood + allDogFood + allTurtle;
        if (allFood <= foodKilo){
            result = foodKilo - allFood;
            System.out.printf("%.0f kilos of food left.", Math.floor(result));
        } else {
            result = allFood - foodKilo;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(result));
        }


    }
}
