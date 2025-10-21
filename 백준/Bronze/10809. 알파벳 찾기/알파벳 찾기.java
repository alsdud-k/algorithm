import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] location = new int[26];
        Arrays.fill(location, -1);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            int w = s.charAt(i) - 'a';
            if (location[w] != -1) continue;
            location[w] = i;
        }

        for (int i = 0; i < 26; i++) System.out.printf("%d ", location[i]);
    }
}
