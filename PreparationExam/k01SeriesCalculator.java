package PreparationExam;

import java.util.Scanner;

public class k01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numberSeasons = Integer.parseInt(scanner.nextLine());
        int numberEpisodes = Integer.parseInt(scanner.nextLine());
        double oneEpisodeTime = Double.parseDouble(scanner.nextLine());
        double advertising = oneEpisodeTime * 0.20;
        double episode = oneEpisodeTime + advertising;
        double extaTime = numberSeasons * 10;
        double totalTime = Math.floor(episode * numberEpisodes * numberSeasons + extaTime);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name , totalTime);
    }
}
