import java.util.*;

public class Main {
    public static String reverse(int x) {
        StringBuffer str = new StringBuffer(Integer.toString(x));

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        String reverse_A = reverse(A);
        String reverse_B = reverse(B);

        if (Integer.parseInt(reverse_A) > Integer.parseInt(reverse_B)) System.out.println(reverse_A);
        else System.out.println(reverse_B);
    }
}
