package lab;
import java.util.Scanner;

public class k07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //⦁	Изготвяне на проекти
        //Напишете програма, която изчислява колко часа ще са необходими на един архитект, за да изготви проектите на няколко строителни обекта. Изготвянето на един проект отнема три часа.
        //Вход
        //От конзолата се четат 2 реда:
        //⦁	Името на архитекта - текст
        //⦁	Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]
        //Изход
        //На конзолата се отпечатва:
        //⦁	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

        String name = scanner.nextLine();
        int numbersProject = Integer.parseInt(scanner.nextLine());
        int project = numbersProject * 3;

        System.out.println("The architect " + name + " need " + project + " hours to complete " + numbersProject + " project/s.");
    }
}
