import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int n = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int r = n % b;
            if (r >= 10) sb.append((char) ('A' + (r - 10)));
            else sb.append(r);
            n /= b;
        }
        
        System.out.println(sb.reverse().toString());
    }
}
