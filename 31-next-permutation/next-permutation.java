class Solution {
    public void nextPermutation(int[] nums) {
        int pointer=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pointer=i-1;
                break;
            }
        }
        if(pointer==-1){
            Arrays.sort(nums);
            return;
        }else{
            for(int i=nums.length-1;i>pointer;i--){
                if(nums[i]>nums[pointer]){
                    swap(nums,i,pointer);
                    // pointer++;
                    break;
                }
            }
            Arrays.sort(nums,pointer+1,nums.length);
        }
    }

    public static void swap(int[] nums, int i,int p){
        int temp=nums[i];
        nums[i]=nums[p];
        nums[p]=temp;
    }

}