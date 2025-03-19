class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            int cur=Math.abs(nums[i]);
            if(cur<1 || cur>nums.length)
            continue;
            if(nums[cur-1]==0) nums[cur-1]=Integer.MIN_VALUE;
            else if(nums[cur-1]>0){
                nums[cur-1]*=-1;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]>=0){
                return i;
            }
        
        }return nums.length+1;
        
    }
}
