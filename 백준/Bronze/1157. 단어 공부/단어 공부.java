import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toUpperCase();
        int[][] chk = new int[26][2];

        for (int i = 0; i < 26; i++) chk[i][0] = i;
        for (int i = 0; i < str.length(); i++) chk[str.charAt(i) - 'A'][1]++;

        int max = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < i; j++) {
                if (chk[i][1] > chk[j][1]) {
                    int k = chk[i][0];
                    chk[i][0] = chk[j][0];
                    chk[j][0] = k;

                    k = chk[i][1];
                    chk[i][1] = chk[j][1];
                    chk[j][1] = k;
                }
            }
        }

        if (chk[0][1] == chk[1][1]) System.out.println("?");
        else System.out.println((char)(chk[0][0]+'A'));
    }
}
