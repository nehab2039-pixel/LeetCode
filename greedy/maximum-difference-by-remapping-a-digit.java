class Solution {
    public int minMaxDifference(int num) {
         String s = String.valueOf(num);
        String max = s;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                max = s.replace(s.charAt(i), '9');
                break;
            }
        }
        String min = s.replace(s.charAt(0), '0');

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}