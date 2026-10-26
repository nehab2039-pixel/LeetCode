class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumwealth=0;
        int i=0;
        int j=0;
        for(i=0;i<accounts.length;i++){
           int sum=0;
            for(j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            maximumwealth=Math.max(sum,maximumwealth);
        }
        return maximumwealth;

        
    }
}