class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (char a : myString.toCharArray()) {
            char b = (a == 'A') ? 'B' : 'A';
            sb.append(b);
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}