import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int D = B+C;

        if (D >= 60) {
            if (A+(D/60) > 23) System.out.printf("%d %d", A+(D/60)-24, D%60);
            else System.out.printf("%d %d", A+(D/60), D%60);
        }
        else System.out.printf("%d %d", A, D);
    }
}
