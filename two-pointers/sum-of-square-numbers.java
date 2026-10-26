class Solution {
    public boolean judgeSquareSum(int c) {
        int left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            long current=(left*left)+(right*right);
            if(current==c){
                return true;
            }
            else if(current>c){
                right--;
            }
            else{
                left++;
            }
        }
        return false;

        
    }
}