class main{
    public static void main(String[]args){
        int[]nums={11,12,2,7};
        int target =9;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target ){
                    System.out.println(nums[i]+" "+nums[j]);
                }
            }
        }
    }
}
/*class Solution{
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[0];

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return new int[0];
    }}*/
