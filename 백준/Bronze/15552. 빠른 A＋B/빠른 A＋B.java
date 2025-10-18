import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            bw.write(String.valueOf(A+B));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
