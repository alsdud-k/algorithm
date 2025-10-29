class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        int before = numLog[0]; 
        for (int i = 1; i < numLog.length; i++) {
            if (before + 1 == numLog[i]) answer += 'w';
            else if (before - 1 == numLog[i]) answer += 's';
            else if (before + 10 == numLog[i]) answer += 'd';
            else if (before - 10 == numLog[i]) answer += 'a';
            before = numLog[i];
        }
        
        return answer;
    }
}