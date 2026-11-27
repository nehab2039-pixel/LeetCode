class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
         int[] count = new int[10000];

        for (int num : deck) {
            count[num]++;
        }

        int gcd = 0;

        for (int c : count) {
            if (c > 0) {
                gcd = findGCD(gcd, c);
            }
        }

        return gcd >= 2;
    }

    public int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}