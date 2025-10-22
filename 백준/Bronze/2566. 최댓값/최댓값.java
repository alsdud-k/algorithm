import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, x = 1, y = 1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
