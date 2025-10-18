import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N+1];

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int y = i; y <= j; y++) basket[y] = k;
        }

        for (int x = 1; x <= N; x++) System.out.printf("%d ", basket[x]);
    }
}
