import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int location = 0;

        for (int i = 1; i <= 9; i++) {
            int x = sc.nextInt();

            if (x > max) {
                max = x;
                location = i;
            }
        }

        System.out.println(max);
        System.out.println(location);
    }
}
