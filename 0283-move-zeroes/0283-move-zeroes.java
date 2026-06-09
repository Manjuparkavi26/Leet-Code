class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int left=0;
        for(int right=0;right<n;right++){
            //if nums of right is pointing to 0

            if(nums[right] !=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        
    }
}