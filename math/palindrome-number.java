class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        long sum=0;
        while(temp>0){
            int a=temp%10;
            sum=sum*10+a;
            temp/=10;
        }
        if(x==sum){
            return true;
        }
        return false;
    }
}
