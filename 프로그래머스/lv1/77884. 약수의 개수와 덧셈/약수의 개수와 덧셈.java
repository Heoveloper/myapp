class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int div = (int) (i/Math.sqrt(i));
            if (div == Math.sqrt(i)) answer -= i;
            else answer += i;
        }
        
        return answer;
    }
}