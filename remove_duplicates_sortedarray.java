class Solution {
    public int removeDuplicates(int[] nums) {
     
        int i = 0, j = 0;
        for(i = 0;i<nums.length; i++){
            int val = nums[i];
            while(i<nums.length-1 && val == nums[i+1]){
                i++;
            }
            nums[j++] = val;
        }
        return j;
    }
} 
