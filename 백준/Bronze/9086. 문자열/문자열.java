import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String word = sc.next();

            System.out.print(word.charAt(0));
            System.out.print(word.charAt(word.length()-1));
            System.out.println();
        }
    }
}
