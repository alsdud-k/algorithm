import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N+1];
        for (int i = 1; i <= N; i++) basket[i] = i;

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int k = basket[x];
            basket[x] = basket[y];
            basket[y] = k;
        }

        for (int i = 1; i <= N; i++) System.out.printf("%d ", basket[i]);
    }
}
