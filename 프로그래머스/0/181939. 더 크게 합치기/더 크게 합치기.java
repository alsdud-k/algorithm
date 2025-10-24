class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = "";
        String y = "";
        
        x = Integer.toString(a)+Integer.toString(b);
        y = Integer.toString(b)+Integer.toString(a);
        
        if (Integer.parseInt(x) > Integer.parseInt(y)) answer = Integer.parseInt(x);
        else answer = Integer.parseInt(y);
        
        return answer;
    }
}