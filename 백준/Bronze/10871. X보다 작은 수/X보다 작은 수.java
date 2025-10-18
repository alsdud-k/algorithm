import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        int len = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < X) {
                arr[len] = num;
                len++;
            }
        }

        for (int i = 0; i < len; i++) System.out.printf("%d ", arr[i]);
    }
}
