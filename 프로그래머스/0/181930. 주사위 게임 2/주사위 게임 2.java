class Solution {
    public int solution(int a, int b, int c) {
     int sum = 0;
        if (a == b && b == c) {
            sum = (int) ((a + b + c) 
                    * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) 
                    * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else if (a == b || a == c || b == c) {
            sum = (int) ((a + b + c) 
                         * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        } else {
            sum = a + b + c;
        }
        return sum;
    }
}