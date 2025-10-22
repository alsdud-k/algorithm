import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            char b = (i+1 < str.length()) ? str.charAt(i+1) : '\0';
            char c = (i+2 < str.length()) ? str.charAt(i+2) : '\0';

            if ((a == 'c' && b == '=') || (a == 'c' && b == '-') || (a == 'd' && b == '-') || (a == 'l' && b == 'j') || (a == 'n' && b == 'j') || (a == 's' && b == '=') || (a == 'z' && b == '=')) {
                cnt++;
                i++;
            }
            else if (a == 'd' && b == 'z' && c =='=') {
                cnt++;
                i += 2;
            }
            else cnt++;
        }

        System.out.println(cnt);
    }
}
