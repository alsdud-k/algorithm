import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] array = new char[5][15];

        for (int i = 0; i < 5; i++) array[i] = sc.nextLine().toCharArray();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                char c = ' ';
                if (i < array[j].length && !Character.isWhitespace(array[j][i])) System.out.print(array[j][i]);
            }
        }
    }
}
