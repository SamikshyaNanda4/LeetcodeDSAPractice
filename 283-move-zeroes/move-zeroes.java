class Solution {
    public void moveZeroes(int[] nums) {
        int moveCounter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[moveCounter]=nums[i];
                moveCounter++;
            }
        }
        for(int i=moveCounter;i<nums.length;i++){
            nums[i]=0;
        }
    }
}