import java.util.Scanner;
import java.lang.*;

public class Main {
    public static int group_word(String s) {
        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (alpha[a-'a'] == 1) return 0;
            alpha[a-'a'] = 1;
            for (int j = i+1; j < s.length(); j++) {
                char b = s.charAt(j);
                if (a != b) break;
                i = j;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int x = 0; x < n; x++) {
            String str = sc.next();
            cnt += group_word(str);
        }

        System.out.println(cnt);
    }
}
