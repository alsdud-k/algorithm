import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score = 0.0;
        double credit = 0.0;
        for (int i = 0; i < 20; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String subject = parts[0];
            double c = Double.parseDouble(parts[1]);
            String grade = parts[2];

            if (grade.equals("P")) continue;
            credit += c;

            if (grade.equals("A+")) score += (c*4.5);
            else if (grade.equals("A0")) score += (c*4.0);
            else if (grade.equals("B+")) score += (c*3.5);
            else if (grade.equals("B0")) score += (c*3.0);
            else if (grade.equals("C+")) score += (c*2.5);
            else if (grade.equals("C0")) score += (c*2.0);
            else if (grade.equals("D+")) score += (c*1.5);
            else if (grade.equals("D0")) score += (c*1.0);
            else score += (c*0.0);
        }

        System.out.println(score/credit);
    }
}
