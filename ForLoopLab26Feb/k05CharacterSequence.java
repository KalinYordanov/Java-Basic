package ForLoopLab26Feb;
import java.util.Scanner;
public class k05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0 ; i< name.length();i++){
            System.out.println(name.charAt(i));
        }
            }
}
