class Solution {
    public int maximumWealth(int[][] a) {
        int ans=0;
        for(int p=0;p<a.length;p++){
            int sum =0;
            for(int r=0;r<a[p].length;r++){
                sum+=a[p][r];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
