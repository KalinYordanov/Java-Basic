package PreparationExam;

import java.util.Scanner;

public class k05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMovies = Integer.parseInt(scanner.nextLine());
        double sumRatings = 0;
        double minRating = 11;
        double maxRating = 0;
        String movieMinRating = "";
        String movieMaxRating = "";
        for (int i = 1; i <= numberOfMovies; i++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());
            sumRatings += movieRating;
            if (minRating > movieRating) {
                minRating = movieRating;
                movieMinRating = movieName;
            }
            if (maxRating < movieRating) {
                maxRating = movieRating;
                movieMaxRating = movieName;
            }

        }
        double averageRating = sumRatings / numberOfMovies;
        System.out.printf("%s is with highest rating: %.1f%n",movieMaxRating, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",movieMinRating,minRating);
        System.out.printf("Average rating: %.1f",averageRating);
    }
}
