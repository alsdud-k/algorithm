import java.util.Scanner;

class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < overwrite_string.length(); i++)
            sb.setCharAt(s + i, overwrite_string.charAt(i));

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();
        
        String answer = solution(my_string, overwrite_string, s);
        System.out.println(answer);
    }
}