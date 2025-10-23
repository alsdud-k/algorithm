import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] parts = line.split(" ");

        String n = parts[0];
        int b = Integer.parseInt(parts[1]);

        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            int l = n.length()-i-1;

            int x = 0, y = 0;
            if (n.charAt(l) >= 'A' && n.charAt(l) <= 'Z') x = n.charAt(l)-'A'+10;
            else x = n.charAt(l)-'0';
            y = (int)Math.pow(b, i);

            num += (x*y);
        }

        System.out.println(num);
    }
}
