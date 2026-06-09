class Solution {
    
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};//(left+1,right+1  here +1 indicates the index which is considered in the given sample output in which the index starts from index[1] instead of index[0])
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1}; //to return a index if no such answer present
    }
}